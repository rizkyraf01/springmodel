package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="daftar_hadir")
public class HadirEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_absensi;

    @Column(name="nip_hadir")
    private Integer nip_hadir;

    @Column(name= "keterangan")
    private String keterangan;

    @Column(name="departemen")
    private String departemen;

    @Column(name= "jabatan")
    private String jabatan;
}
