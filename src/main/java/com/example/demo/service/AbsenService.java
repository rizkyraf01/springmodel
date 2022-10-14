package com.example.demo.service;

import com.example.demo.entity.AbsenEntity;
import com.example.demo.entity.KaryawanEntity;
import com.example.demo.repo.AbsenEntityRepo;
import com.example.demo.repo.KaryawanEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@Transactional
public class AbsenService {

    @Autowired
    private AbsenEntityRepo absenEntityRepo;

    public Iterable<AbsenEntity> findAll(){
        return absenEntityRepo.findAll();
    }

    public void addAbsensi(AbsenEntity addabsen){
        absenEntityRepo.save(addabsen);
    }

    public Optional<AbsenEntity> absensiAbsensiById(Integer nip){
        return absenEntityRepo.findById(nip);
    }





}
