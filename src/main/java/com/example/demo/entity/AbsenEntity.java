package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Setter
@Getter
@Entity
@Table(name="daftar_absen")
public class AbsenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="nip_absen")
    private Integer nip_absen;

    @Column(name= "departemen")
    private String departemen;

    @Column(name="jabatan")
    private String jabatan;

    @Column(name="jam_masuk")
    private Timestamp jam_masuk;
}
