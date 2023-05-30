package com.example.demojava5d9.controller;

import com.example.demojava5d9.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    public  ProductService service;
    @GetMapping("/abc-hien-thi/")
    public String viewAll(Model model){
        model.addAttribute("listProduct",service.getAllPro());
        return "product";
    }
}
