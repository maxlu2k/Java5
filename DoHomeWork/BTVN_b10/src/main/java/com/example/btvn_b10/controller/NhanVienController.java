package com.example.btvn_b10.controller;

import com.example.btvn_b10.repository.NhanVienRepository;
import com.example.btvn_b10.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nhan-vien/")
public class NhanVienController {
    @Autowired
    private NhanVienService service;
    @GetMapping("hien-thi")
    public String hienThi(Model model){
        model.addAttribute("listNhanVien",service.getAll());
        return "quan-ly";
    }
}
