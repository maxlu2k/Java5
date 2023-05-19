package com.example.demojava5d3.controller;

import com.example.demojava5d3.entity.SinhVien;
import com.example.demojava5d3.service.SinhVienService;
import com.example.demojava5d3.service.impl.SinhVienServiceImpl;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sinh-vien/")
public class SinhVienController {
    private SinhVienService sinhVienService = new SinhVienServiceImpl();
    //interface new class
    private List<SinhVien> lists = new ArrayList<>();

    @GetMapping("hien-thi")
    public String hienThiSinhVien(Model model) {
        lists = sinhVienService.getAll();
        model.addAttribute("sinhViens", lists);
        return "/sinhviens";
    }

    //muốn trả về kiểu dữ liệu khác trong controller thì bắt buộc phải dùng @ResponseBody
    //cách 2 sẽ sử dụng restController thì sẽ bỏ @ResponseBody đi => Controller return 1 String  || RestController sẽ trả về API
    //dùng PartVariable : cung cấp giá trị trên url
    @GetMapping("detail/{mssv}")
    public String detailSinhVien(Model model, @PathVariable("mssv") String maSV) {
        SinhVien sinhVien = sinhVienService.detailSinhVien(maSV);
        model.addAttribute("sv", sinhVien);
        return "detail-sinh-vien";
    }

    @GetMapping("delete/{ma}")
    public String removeGV(Model model, @PathVariable("ma") String ma) {
        sinhVienService.deleteSinhVien(ma);
//        lists = sinhVienService.getAll();
//        model.addAttribute("sinhViens",lists);
        return "redirect:/sinh-vien/hien-thi";

    }
    //  C1
//    @GetMapping("view-add")
//    public String viewAddSinhVien() {
////        sinhVienService.addSinhVien();
//        return "add-sinh-vien";
//    }
//
//    @PostMapping("add")
//    public String addSinhVien(@RequestParam("mssv") String masv,
//                              @RequestParam("ten") String ten,
//                              @RequestParam("tuoi") String tuoi,
//                              @RequestParam("diaChi") String diaChi,
//                              @RequestParam("gioiTinh") String gioiTinh) {
////       SinhVien sinhVien = new SinhVien(masv,ten,Integer.valueOf(tuoi),diaChi,Boolean.valueOf(gioiTinh));
//        SinhVien sinhVien = SinhVien.builder()
//                .mssv(masv)
//                .ten(ten)
//                .tuoi(Integer.valueOf(tuoi))
//                .diaChi(diaChi)
//                .gioiTinh(Boolean.valueOf(gioiTinh))
//                .build();
//        sinhVienService.addSinhVien(sinhVien);
//        return "redirect:/sinh-vien/hien-thi";
//    }

    //C2: data binding là cơ chế mapping 2 chiều MODEL <=> VIEW
//    => Spring form
    @GetMapping("view-add")
    public String viewAddSinhVien(Model model){
        //khởi to ra 1 object rồi truyền sang view
        model.addAttribute("sv1", new SinhVien());
        return "/buoi5/add-sinh-vien";
    }

    @PostMapping("add")
    public String addSinhVien(@Valid @ModelAttribute("sv1") SinhVien sinhVien, BindingResult result){
        //nếu mà có lỗi =>hashError = true => trang add
        if(result.hasErrors()){
            return "/buoi5/add-sinh-vien";
        }
        sinhVienService.addSinhVien(sinhVien);
        return "redirect:/sinh-vien/hien-thi";
    }
}