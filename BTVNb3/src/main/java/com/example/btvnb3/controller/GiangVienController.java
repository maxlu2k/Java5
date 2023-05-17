package com.example.btvnb3.controller;

import com.example.btvnb3.entity.GiangVien;
import com.example.btvnb3.service.GiangVienService;
import com.example.btvnb3.service.impl.GiangVienServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/giang-vien/")
public class GiangVienController {
    private GiangVienService giangVienService = new GiangVienServiceImpl();

    private List<GiangVien> lists = new ArrayList<>();

    @GetMapping("hien-thi")
    public String hienThi(Model model) {
        lists = giangVienService.getAll();
        model.addAttribute("giangViens", lists);
        return "giang-vien";
    }

    @GetMapping("search")
    public String timKiem(@RequestParam("ten") String ten, Model model) {
        if (ten != null && !ten.isEmpty()) {
            lists = giangVienService.findByTen(ten);
        } else {
            lists = giangVienService.getAll();
        }
        model.addAttribute("giangViens", lists);
        return "giang-vien";
    }

    @GetMapping("giang-vien-nu")
    public String giangVienNu(Model model) {
        lists = giangVienService.findByGioiTinh();
        model.addAttribute("giangViens", lists);
        return "giang-vien";
    }

    @GetMapping("detail/{ma}")
    public String detailGiangVien(Model model, @PathVariable("ma") String ma) {
        GiangVien giangVien = giangVienService.detailGiangVien(ma);
        model.addAttribute("gv", giangVien);
        return "detail-giang-vien";
    }

    @GetMapping("delete/{id}")
    public String removeGiangVien(Model model, @PathVariable("id") String id) {
        giangVienService.deleteGiangVien(id);
//        model.addAttribute("giangViens", lists);
        return "redirect:/giang-vien/hien-thi";
    }

    @GetMapping("view-update/{ma}")
    public String viewUpdateGiangVien(Model model, @PathVariable("ma") String ma) {
        GiangVien giangVien = this.giangVienService.detailGiangVien(ma);
        model.addAttribute("gv", giangVien);
        return "update-giang-vien";
    }

    @PostMapping("update")
    public String updateGiangVien(@RequestParam("ma") String ma,
                                  @RequestParam("ten") String ten,
                                  @RequestParam("tuoi") String tuoi,
                                  @RequestParam("diaChi") String diaChi,
                                  @RequestParam("gioiTinh") String gioiTinh) {
//        int lastIndex = lists.size() - 1;
//        System.out.println(lastIndex);
//        GiangVien gv = lists.get(lastIndex);
//        System.out.println("Last person's ID: " + gv.getId());
//
//        GiangVien giangVien = GiangVien.builder()
//                .id(gv.getId() + 1)
//                .ma(ma)
//                .ten(ten)
//                .tuoi(Integer.valueOf(tuoi))
//                .diaChi(diaChi)
//                .gioiTinh(Boolean.valueOf(gioiTinh))
//                .build();
//        giangVienService.updateGiangVien(giangVien);
        return "redirect:/giang-vien/hien-thi";
    }

    @GetMapping("view-add")
    public String viewAdd() {
        return "view-add-giang-vien";
    }

    @PostMapping("add")
    public String addGiangVien(@RequestParam("ma") String ma,
                               @RequestParam("ten") String ten,
                               @RequestParam("tuoi") String tuoi,
                               @RequestParam("diaChi") String diaChi,
                               @RequestParam("gioiTinh") String gioiTinh, Model model) {

        if (ma.isBlank() || ten.isBlank() || tuoi.isBlank() || diaChi.isBlank() || gioiTinh.isBlank()) {
            model.addAttribute("errStatus", "Không để trống các ô");
            return "view-add-giang-vien";
        } else {
            try {
                int age = Integer.parseInt(tuoi);
                if (age > 20) {
                    int lastIndexs = lists.size() - 1;
                    System.out.println(lastIndexs);
                    GiangVien gv = lists.get(lastIndexs);
                    System.out.println("Last person's ID: " + gv.getId());

                    GiangVien giangVien = GiangVien.builder()
                            .id(gv.getId() + 1)
                            .ma(ma)
                            .ten(ten)
                            .tuoi(age)
                            .diaChi(diaChi)
                            .gioiTinh(Boolean.valueOf(gioiTinh))
                            .build();
                    giangVienService.addGiangVien(giangVien);
                    return "redirect:/giang-vien/hien-thi";
                } else {
                    // tuoi khong lon hon 20
                    model.addAttribute("errStatusTuoi", "Tuoi phai lon hon 20");
                    return "view-add-giang-vien";
                }
            } catch (NumberFormatException e) {
                // tuoi khong phai la so nguyen
                model.addAttribute("errStatusTuoi", "Không phải là số nguyên");
                return "view-add-giang-vien";
            }
        }
    }
}
