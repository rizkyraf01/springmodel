package com.example.demo.repo;

import com.example.demo.entity.AbsenEntity;
import com.example.demo.entity.HadirEntity;
import org.springframework.data.repository.CrudRepository;

public interface AbsenEntityRepo extends CrudRepository<AbsenEntity, Integer> {
}
