package com.example.demo.repo;

import com.example.demo.entity.KaryawanEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaryawanEntityRepo extends CrudRepository<KaryawanEntity, Integer> {
//    KaryawanEntity saveKaryawanEntity(KaryawanEntity karyawanEntity);
}
