package com.poly.tiennh21.ph19187.controller;

import com.poly.tiennh21.ph19187.entity.ThucVat;
import com.poly.tiennh21.ph19187.service.Impl.ThưcVatServiceImpl;
import com.poly.tiennh21.ph19187.service.ThucVatService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thuc-vat/")
public class ThucVatController {
    public ThucVatService thucVatService = new ThưcVatServiceImpl();
    private List<ThucVat> lists = new ArrayList<>();
    @GetMapping("hien-thi-tat-ca")
    public String hienThi(Model model, @ModelAttribute("tv1") ThucVat thucVat){
        lists = thucVatService.getAll();
        model.addAttribute("tv",lists);
        return "view-thuc-vat";
    }
    @PostMapping("add")
    public String addThucVat(Model model, @Valid @ModelAttribute("tv1") ThucVat thucVat, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/thuc-vat/hien-thi-tat-ca";
        }
        model.addAttribute("tvv",new ThucVat());
        thucVatService.addThucVat(thucVat);
        return "view-thuc-vat";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma, Model model){
        System.out.println(ma+"===");
        thucVatService.deleteThucVat(ma);
        model.addAttribute("tv",lists);
        return "redirect:/thuc-vat/hien-thi-tat-ca";
    }

    @GetMapping("view-update/{ma}")
    public String viewupdate(@PathVariable("ma") String ma, Model model){
        ThucVat thucVat = thucVatService.detailById(ma);
        System.out.println(ma+"===");
        model.addAttribute("tvv",thucVat);
        return "view-thuc-vat";
    }
    @GetMapping("update")
    public String Update(){
        return "update";
    }
}
