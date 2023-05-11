package com.example.demojava5d2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/index")
    public String homePage(){
        //truyền một giá trị từ controller sang jsp
//        model.addAttribute("username","ph19187");
        return "index";
    }
    @PostMapping("/ket-qua")
    public String getForm(Model model, @RequestParam("user") String username, @RequestParam("pass") String passWord ){
        model.addAttribute("nameUser", username);
        model.addAttribute("namePass", passWord);
        return "buoi2/ketQua";
    }

}
//mô hình MVC viết tắt của model-view-controller
//kiểu dữ liệu trong controller luôn luôn là 1 string (trả về 1 view)
//get để hiển thị dữ liệu
//post để sử lý dữ liệu