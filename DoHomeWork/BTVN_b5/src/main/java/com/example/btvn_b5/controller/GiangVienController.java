package com.example.btvn_b5.controller;

import com.example.btvn_b5.entity.GiangVien;
import com.example.btvn_b5.service.GiangVienService;
import com.example.btvn_b5.service.Impl.GiangVienServiceImpl;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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


    @GetMapping("hien-thi-tat-ca")
    public String hienThi(Model model, @ModelAttribute("gv1") GiangVien giangVien){
        lists = giangVienService.getAll();
        model.addAttribute("gv",lists);
//        model.addAttribute("gv1",new GiangVien());
        return "view-giang-vien";
    }
    @GetMapping("detail/{maGV}")
    public String fillDetailGiangVien(Model model,@PathVariable("maGV") String maGV, @ModelAttribute("gv1") GiangVien giangVien){
        lists = giangVienService.getAll();
        model.addAttribute("gv",lists); //from thường
        model.addAttribute("gv1",new GiangVien()); //from jsp taglib ModelAttribute
        GiangVien giangVien2 = giangVienService.detailGiangVien(maGV);
        model.addAttribute("gvv",giangVien2);
        return "view-giang-vien";
    }

    @GetMapping("delete/{maGV}")
    public String deleteGiangVien(@PathVariable("maGV") String maGV){
        giangVienService.deleteGV(maGV);
        return "redirect:/giang-vien/hien-thi-tat-ca";
    }

    @GetMapping("view-update/{maGV}")
    public String viewUpdateGiangVien(Model model,@PathVariable("maGV") String maGV, @ModelAttribute("gv1") GiangVien giangVien){
        model.addAttribute("gv1",new GiangVien());
        GiangVien giangVien2 = giangVienService.detailGiangVien(maGV);
        model.addAttribute("gvv",giangVien2);
        return "view-update-giang-vien";
    }
    @PostMapping("update")
    public String updateGiangVien(){
        return "redirect:/giang-vien/hien-thi-tat-ca";
    }

    @GetMapping("search")
    public String searchAll(Model model, @RequestParam("ten") String ten,@RequestParam(value="min", required = false) Integer min, @RequestParam(value = "max", required = false) Integer max,@ModelAttribute("gv1") GiangVien giangVien){
        if (ten != null && !ten.isEmpty() && min != null && max != null) {
            lists = giangVienService.searchGVByName(ten, min, max);
        } else {
            lists = giangVienService.getAll();
        }
        model.addAttribute("gv",lists);
        return "view-giang-vien";
    }

    @PostMapping("add")
    public String addGiangVien(Model model, @Valid @ModelAttribute("gv1") GiangVien giangVien, BindingResult result){
        if(result.hasErrors()){
            lists = giangVienService.getAll();
            model.addAttribute("gv",lists);
            return "view-giang-vien";
        }
        giangVienService.addGV(giangVien);
        lists = giangVienService.getAll();
        model.addAttribute("gv",lists);
        model.addAttribute("gvMoi",giangVien);
        model.addAttribute("status","Add thành công");
        return "view-giang-vien";
    }
}
