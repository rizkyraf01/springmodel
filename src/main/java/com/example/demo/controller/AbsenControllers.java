package com.example.demo.controller;

import com.example.demo.entity.AbsenEntity;
import com.example.demo.service.AbsenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AbsenControllers {
    @Autowired
    private AbsenService absenService;

    // Absen Karyawan
    @GetMapping("/absenlist")
    public String absenlist(Model model){
        model.addAttribute("daftarabsen",absenService.findAll());
        return "listabsen";
    }

    @GetMapping("/add/absen")
    public String add(Model model){
        model.addAttribute("addAbsensi", new AbsenEntity());
        return "addabsen";
    }

    @PostMapping("/save/absen")
    public  String save(AbsenEntity addAbsensis){
        absenService.addAbsensi(addAbsensis);
        return "redirect:/add/absen";
    }
}