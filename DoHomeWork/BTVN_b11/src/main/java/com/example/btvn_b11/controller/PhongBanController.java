package com.example.btvn_b11.controller;

import com.example.btvn_b11.entity.PhongBan;
import com.example.btvn_b11.service.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/phong-ban/")
public class PhongBanController {
    @Autowired
    private PhongBanService service;

    @GetMapping("hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listPB", service.getAll());
        return "quan-ly-pb";
    }

    @GetMapping("hien-thi-p")
    public String hienThiPhanTrang(@ModelAttribute("pb") PhongBan phongBan, Model model, @RequestParam(value = "p", defaultValue = "0") Integer pageNo) {
        Page<PhongBan> pb = service.pages(pageNo, 2);
                    
        model.addAttribute("listPB", pb);
        return "quan-ly-pb";
    }
}
