package com.poly.tiennh21.ph19187.controller;

import com.poly.tiennh21.ph19187.entity.ThucVat;
import com.poly.tiennh21.ph19187.service.Impl.ThucVatServiceImpl;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String addThucVat(Model model, @Valid @ModelAttribute("tv1") ThucVat thucVat, BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("tv", list);
            return "thuc-vat";
        }
        int lastIndexs = list.size() - 1;
        System.out.println(lastIndexs);
        ThucVat gv = list.get(lastIndexs);
        thucVat.setId(gv.getId()+1);
//        model.addAttribute("tvAdd",new ThucVat());
        thucVatService.addThucVat(thucVat);
        thucVatService.getAll();
        model.addAttribute("tv", list);
        return "thuc-vat";
    }

    @GetMapping("delete/{id}")
    public String deleteThucVat(@PathVariable("id") Integer id){
        thucVatService.deleteThucVat(id);
        return "redirect:/thuc-vat/hien-thi-tat-ca";
    }
}
