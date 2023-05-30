package com.example.btvn_b9.controller;

import com.example.btvn_b9.entity.LopHoc;
import com.example.btvn_b9.service.LopHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/lop-hoc/")
public class LopHocController {
    @Autowired
    private LopHocService service;
    private List<LopHoc> list = new ArrayList<>();

    @GetMapping("view")
    public String hienThi(Model model, @ModelAttribute("lh") LopHoc lopHoc) {
        list = service.getAll();
        model.addAttribute("lh", list);
        return "page";
    }

    @GetMapping("page")
    public String phanTrang(@ModelAttribute("lh") LopHoc lopHoc, @RequestParam(value = "p", defaultValue = "0") Integer pageNo, Model model) {
        Page<LopHoc> lops = service.pTrang(pageNo, 5);
        model.addAttribute("lops", lops);
        return "page";
    }

    @GetMapping("search")
    public String timKiem(@ModelAttribute("lh") LopHoc lopHoc, @RequestParam("ten") String ten, @RequestParam("diaDiem") String diaDiem, @RequestParam(value = "p", defaultValue = "0") Integer pageNo, Model model) {
        Page<LopHoc> lops = service.searchPTrang(ten, diaDiem, pageNo, 5);
        model.addAttribute("lops", lops);
        return "page";
    }

    @PostMapping("add")
    public String them(@ModelAttribute("lh") LopHoc lopHoc) {
        if (lopHoc.getId() == null) {
            service.add(lopHoc);
        } else {
            service.update(lopHoc);
        }
        return "redirect:/lop-hoc/page";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model, @RequestParam(value = "p", defaultValue = "0") Integer pageNo) {
        LopHoc lopHoc = service.detailLopHoc(id);
        model.addAttribute("lh", lopHoc);
        Page<LopHoc> lops = service.pTrang(pageNo, 5);
        model.addAttribute("lops", lops);
        return "page";
    }

    //    @PostMapping("/add")
//    public String update(@ModelAttribute("lh") LopHoc lopHoc){
//        service.update(lopHoc);
//        return "redirect:/lop-hoc/page";
//    }
    @GetMapping("remove/{id}")
    public String xoa(@PathVariable Long id){
        service.deleteById(id);
        return "redirect:/lop-hoc/page";
    }
}
