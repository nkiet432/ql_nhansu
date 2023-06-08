package com.example.NguyenTuanKiet_2011061626.controller;

import com.example.NguyenTuanKiet_2011061626.entity.NHANVIEN;
import com.example.NguyenTuanKiet_2011061626.service.NHANVIENSERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/nhanviens")
public class NHANVIENController {
    @Autowired
    private NHANVIENSERVICE nhanvienservice;

    @GetMapping
    public String showAllNHANVIEN(Model model){
        List<NHANVIEN> nhanvien = nhanvienservice.getAllNHANVIENs();
        model.addAttribute("nhanviens", nhanvien);
        return "nhanvien/list";
    }
}
