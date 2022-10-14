package com.example.demo.controller;

import com.example.demo.entity.KaryawanEntity;
import com.example.demo.service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class KaryawanController {

    @Autowired
    private KaryawanService karyawanService;
    // Daftar karyawan
    @GetMapping
    public String home(Model model){
        String messages = "WELCOME TO MY SPRING";
        model.addAttribute("msg", messages);
        model.addAttribute("daftarkaryawan", karyawanService.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("addKaryawan", new KaryawanEntity());
        return "add";
    }

    @PostMapping("/save")
    public  String save(KaryawanEntity addPegawai){
        karyawanService.addKaryawan(addPegawai);
        return "redirect:/";
    }

    @GetMapping("/delete/{nip}")
    public String delete(@PathVariable("nip") Integer nip){
        karyawanService.deleteKaryawanById(nip);
        return "redirect:/";
    }

    @GetMapping("/edit/{nip}")
    public String edit(@PathVariable("nip") Integer nip, Model model){
        model.addAttribute("updateKaryawan", karyawanService.karyawanFindById(nip));
        return "edit";
    }

    @PostMapping("/update")
    public String update(KaryawanEntity updatePegawai, Model model){
        karyawanService.updateKaryawan(updatePegawai);
        return "redirect:/";
    }
}
