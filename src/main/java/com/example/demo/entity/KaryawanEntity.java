package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.core.serializer.Serializer;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="daftar_karyawan")
public class KaryawanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nip;

    @Column(name="nama_karyawan")
    private String name;

    @Column(name="jenis_karyawan")
    private String jenis_karyawan;

    @Column(name="no_telpon")
    private int no_telpon;

    @Column(name="alamat")
    private String alamat;

    @Column(name="departemen")
    private String departemen;

    @Column(name="jabatan")
    private String jabatan;

    @Column(name="email")
    private String email;

    public KaryawanEntity(){

    }

    public KaryawanEntity(Integer nip,String name,String jenis_karyawan,int no_telpon,String alamat,String departemen,String jabatan,String email){
       this.nip=nip;
       this.name=name;
       this.jenis_karyawan=jenis_karyawan;
       this.no_telpon=no_telpon;
       this.alamat=alamat;
       this.departemen=departemen;
       this.jabatan=jabatan;
       this.email=email;
    }
    @Override
    public String toString(){
        return "KaryawanEntitiy[Karyawan nip =" + nip+", name= " + name+", jenis_karyawan= "+ jenis_karyawan+ ",no_telpon = "+ no_telpon+"" +
                ",alamat="+alamat+",departemen ="+departemen+",jabatan= "+jabatan+",email= "+email+"]";
    }
}
