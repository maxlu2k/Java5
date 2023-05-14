package com.example.btvnb3.controller;

import com.example.btvnb3.entity.GiangVien;
import com.example.btvnb3.service.GiangVienService;
import com.example.btvnb3.service.impl.GiangVienServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GiangVienController {
    private GiangVienService giangVienService = new GiangVienServiceImpl();

    private List<GiangVien>lists = new ArrayList<>();

    @GetMapping("/giang-vien/hien-thi")
    public String hienThi(Model model){
        lists = giangVienService.getAll();
        model.addAttribute("giangViens",lists);
        return "giang-vien";
    }

    @GetMapping("/giang-vien/search")
    public String timKiem(@RequestParam("ten") String ten, Model model) {
        if (ten != null && !ten.isEmpty()) {
            lists = giangVienService.findByTen(ten);
        } else {
            lists = giangVienService.getAll();
        }
        model.addAttribute("giangViens", lists);
        return "giang-vien";
    }
    @GetMapping("/giang-vien/giang-vien-nu")
    public String giangVienNu(Model model) {
        lists = giangVienService.findByGioiTinh();
        model.addAttribute("giangViens", lists);
        return "giang-vien";
    }
    @GetMapping("/giang-vien/detail/{ma}")
    public String detailGiangVien(Model model, @PathVariable("ma") String ma){
        GiangVien giangVien = giangVienService.detailGiangVien(ma);
        model.addAttribute("gv",giangVien);
        return "detail-giang-vien";
    }
    @GetMapping("/giang-vien/delete/{id}")
    public String removeGiangVien(Model model, @PathVariable("id") String id){
        lists = giangVienService.deleteById(id);
        model.addAttribute("giangViens", lists);
        return "giang-vien";
    }
}
