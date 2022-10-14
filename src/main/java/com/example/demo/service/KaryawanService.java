package com.example.demo.service;

import com.example.demo.entity.KaryawanEntity;
import com.example.demo.repo.KaryawanEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class KaryawanService {

    @Autowired
    private KaryawanEntityRepo karyawanEntityRepo;

    public Iterable<KaryawanEntity> findAll(){
        return karyawanEntityRepo.findAll();
    }

    public void addKaryawan(KaryawanEntity addkaryawan){
        karyawanEntityRepo.save(addkaryawan);
    }
    public void deleteKaryawanById(Integer nip){
        karyawanEntityRepo.deleteById(nip);
    }

    public Optional<KaryawanEntity> karyawanFindById(Integer nip){
        return karyawanEntityRepo.findById(nip);
    }

    public void updateKaryawan(KaryawanEntity updateKaryawan){
        karyawanEntityRepo.save(updateKaryawan);
    }
}
