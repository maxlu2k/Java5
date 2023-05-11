package com.example.btday2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginPage(){
        return "Login";
    }

    @PostMapping("/home")
    public String resultPage(Model model, @RequestParam("user") String userName, @RequestParam("pass") String passWord){
        if(userName.equals("") || passWord.equals("")){
            model.addAttribute("statusLogin", "Không để trống username hoặc password");
            return "Login";
        }
        else if(userName.equals("HangNT169") && passWord.equals("123456")){
            model.addAttribute("outputUser", userName);
            model.addAttribute("outputPass", passWord);
            model.addAttribute("statusLogin", "Đăng nhập thành công!");
            return "Home";
        }else {
            model.addAttribute("statusLogin", "Tài khoản không đúng!");
            return "Login";
        }
    }
}
