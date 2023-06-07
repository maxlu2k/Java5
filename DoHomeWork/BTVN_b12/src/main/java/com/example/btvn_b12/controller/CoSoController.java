package com.example.btvn_b12.controller;

import com.example.btvn_b12.entity.CoSo;
import com.example.btvn_b12.entity.TaiKhoanNganHang;
import com.example.btvn_b12.repository.CoSoRepositoryCS;
import com.example.btvn_b12.service.CoSoService;
import com.example.btvn_b12.service.TaiKhoanNganHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/co-so/")
public class CoSoController {
    @Autowired
    private CoSoService service;
    @Autowired
    private TaiKhoanNganHangService serviceTKNH;

    @Autowired
    private CoSoRepositoryCS repositoryCS;
    @GetMapping("hien-thi")
    public String hienThi(Model model) {
        Boolean show = false;
        model.addAttribute("show", show);
        return "home-page";
    }

    @GetMapping("hien-thi-table")
    public String hienThiDetail(Model model, @RequestParam(name="pageNo",defaultValue = "0")Integer pageNo) {
        Boolean show = true;
        Pageable pageable = PageRequest.of(pageNo,2);
        Page<CoSo> coSoPage = repositoryCS.findAll(pageable);
        model.addAttribute("show", show);
        model.addAttribute("listCs", coSoPage);
        return "home-page";
    }

    @GetMapping("view-add")
    public String viewAdd(Model model, @ModelAttribute("modelList") CoSo coSo) {
        List<TaiKhoanNganHang> danhSachTaiKhoanNganHang = serviceTKNH.getAll();
        model.addAttribute("danhSachTaiKhoanNganHang", danhSachTaiKhoanNganHang);
        return "view-add";
    }

    @PostMapping("add")
    public String add(@ModelAttribute("modelList") @Valid CoSo coSo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "view-add";
        }
        service.add(coSo);
        return "redirect:/co-so/hien-thi-table";
    }

    @GetMapping("remove/{id}")
    public String remove(Model model, @PathVariable("id") UUID id) {
        service.delete(id);
        return "redirect:/co-so/hien-thi-table";
    }

    @GetMapping("search")
    public String searchAdmin(String ma){
        return "home-page";
    }
    @GetMapping("view-update/{id}")
    public String viewUpdate(Model model, @PathVariable("id") UUID id) {
        Optional<CoSo> optionalCoSo = service.findByID(id);
        if (optionalCoSo.isPresent()) {
            CoSo coSo = optionalCoSo.get();
            List<TaiKhoanNganHang> danhSachTaiKhoanNganHang = serviceTKNH.getAll();
            model.addAttribute("danhSachTaiKhoanNganHang", danhSachTaiKhoanNganHang);
            model.addAttribute("coSo", coSo);
            return "view-update";
        } else {
            // Xử lý trường hợp không tìm thấy đối tượng với id tương ứng
            return "redirect:/co-so/hien-thi-table";
        }
    }
    @PostMapping("update/{id}")
    public String updateCoSo(@PathVariable("id") UUID id, @ModelAttribute("coSo") CoSo updatedCoSo) {
        Optional<CoSo> coSoOptional = repositoryCS.findById(id);
        if (coSoOptional.isPresent()) {
            CoSo coSo = coSoOptional.get();
            // Update the properties of the existing object
            coSo.setMa(updatedCoSo.getMa());
            coSo.setTaiKhoanNganHang(updatedCoSo.getTaiKhoanNganHang());
            coSo.setSoDienThoai(updatedCoSo.getSoDienThoai());
            coSo.setGhiChu(updatedCoSo.getGhiChu());
            coSo.setTrangThai(updatedCoSo.getTrangThai());

            repositoryCS.save(coSo); // Save the updated object

            return "redirect:/co-so/hien-thi-table";
        } else {
            // Handle case when object with corresponding id is not found
            return "redirect:/co-so/hien-thi-table";
        }
    }
    @GetMapping("view-detail/{id}")
    public String viewDetail(Model model, @PathVariable("id") UUID id) {
        Optional<CoSo> optionalCoSo = service.findByID(id);
        if (optionalCoSo.isPresent()) {
            CoSo coSo = optionalCoSo.get();
            List<TaiKhoanNganHang> danhSachTaiKhoanNganHang = serviceTKNH.getAll();
            model.addAttribute("danhSachTaiKhoanNganHang", danhSachTaiKhoanNganHang);
            model.addAttribute("coSo", coSo);
            return "view-detail";
        } else {
            // Xử lý trường hợp không tìm thấy đối tượng với id tương ứng
            return "redirect:/co-so/hien-thi-table";
        }
    }
}
