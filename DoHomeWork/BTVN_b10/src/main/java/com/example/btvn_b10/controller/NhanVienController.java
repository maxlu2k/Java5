package com.example.btvn_b10.controller;

import com.example.btvn_b10.entity.NhanVien;
import com.example.btvn_b10.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/nhan-vien/")
public class NhanVienController {
    @Autowired
    private NhanVienService service;
    @GetMapping("hien-thi-goc")
    public String hienThi(Model model){
        model.addAttribute("listNhanVien",service.getAll());
        return "quan-ly";
    }
    @GetMapping("hien-thi")
    public String pageView(Model model, @RequestParam(value = "p", defaultValue = "0") Integer pageNo){
        Page<NhanVien> nv = service.pages(pageNo, 5);
        model.addAttribute("listNhanVien",nv);
        return "quan-ly";
    }


}
