package com.example.demojava5d3.controller;

import com.example.demojava5d3.entity.SinhVien;
import com.example.demojava5d3.service.SinhVienService;
import com.example.demojava5d3.service.impl.SinhVienServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {
    private SinhVienService sinhVienService = new SinhVienServiceImpl();
    //interface new class

    private List<SinhVien>lists = new ArrayList<>();

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiSinhVien(Model model){
        lists = sinhVienService.getAll();
        model.addAttribute("sinhViens",lists);
        return "sinhviens";
    }
    //muốn trả về kiểu dữ liệu khác trong controller thì bắt buộc phải dùng @ResponseBody
    //cách 2 sẽ sử dụng restController thì sẽ bỏ @ResponseBody đi => Controller return 1 String  || RestController sẽ trả về API


    //dùng PartVariable : cung cấp giá trị trên url
    @GetMapping("/sinh-vien/detail/{mssv}")
    public String detailSinhVien(Model model, @PathVariable("mssv") String maSV){
        SinhVien sinhVien = sinhVienService.detailSinhVien(maSV);
        model.addAttribute("sv",sinhVien);
        return "detail-sinh-vien";
    }
}