package com.example.demo.service;

import com.example.demo.entity.KaryawanEntity;
import com.example.demo.repo.KaryawanEntityRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KaryawanServiceImpl {


    private final KaryawanEntityRepo karyawanEntityRepo;


    public KaryawanServiceImpl(KaryawanEntityRepo karyawanEntityRepo) {
        this.karyawanEntityRepo = karyawanEntityRepo;
    }


    public List<KaryawanEntity> findAll() {

        var it = karyawanEntityRepo.findAll();

        var users = new ArrayList<KaryawanEntity>();
        it.forEach(e -> users.add(e));

        return users;
    }

    public Integer count() {

        return Math.toIntExact(karyawanEntityRepo.count());
    }

    public void deleteById(Integer nip) {

        karyawanEntityRepo.deleteById(nip);
    }
}
