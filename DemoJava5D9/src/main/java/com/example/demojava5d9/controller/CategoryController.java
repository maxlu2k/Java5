package com.example.demojava5d9.controller;

import com.example.demojava5d9.entity.Category;
import com.example.demojava5d9.service.CategoryService;
import com.example.demojava5d9.service.Impl.CategoryRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService service;
    private List<Category> list = new ArrayList<>();

    @GetMapping("/ccccc")
    public String hienThi(Model model) {
        list = service.getAll();
        model.addAttribute("ct", list);
        return "view";
    }
    @ResponseBody
    @GetMapping("/phantrang")
    public Page<Category> phanTrang(@RequestParam(value = "pageNo",defaultValue = "0")Integer pageNo){
        return service.phanTrang(pageNo,2);
    }

}
