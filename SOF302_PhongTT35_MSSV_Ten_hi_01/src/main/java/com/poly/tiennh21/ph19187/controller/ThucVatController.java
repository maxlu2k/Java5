package com.poly.tiennh21.ph19187.controller;

import com.poly.tiennh21.ph19187.entity.ThucVat;
import com.poly.tiennh21.ph19187.service.Impl.ThucVatServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thuc-vat/")
public class ThucVatController {
    private ThucVatServiceImpl thucVatService = new ThucVatServiceImpl();
    private List<ThucVat> list = new ArrayList<>();
    @GetMapping("hien-thi-tat-ca")
    public String thucVat(Model model, @ModelAttribute("tv1")ThucVat thucVat){
        list = thucVatService.getAll();
        model.addAttribute("tv",list);
        return "thuc-vat";
    }

    @GetMapping("tim-kiem")
    public String timKiemTV(Model model,@RequestParam("ten1") String ten,@RequestParam(value = "min",required = false) Integer min,@RequestParam(value = "max",required = false) Integer max,@ModelAttribute("tv1")ThucVat thucVat){
        if(ten != null && !ten.isEmpty() && min != null && max != null){ //chưa check input phải là dạng số
            list = thucVatService.timKiem(ten,min,max);
        }else {
            list = thucVatService.getAll();
        }
        model.addAttribute("tv",list);
        return "thuc-vat";
    }
    @PostMapping("add")
    public String addThucVat(Model model,@ModelAttribute("tv1") ThucVat thucVat){
        model.addAttribute("tvAdd",new ThucVat());
        model.addAttribute("tv", list);
        return "thuc-vat";
    }
}
