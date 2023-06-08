package com.example.NguyenTuanKiet_2011061626.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "nhanvien")
public class NHANVIEN {
    @Id
    @Column(name = "ma_nv")
    public String ma_nv;


    @Column(name = "ten_nv")
    public String ten_nv;


    @Column(name = "phai")
    public String phai;


    @Column(name = "noi_sinh")
    public String noi_sinh;


    @ManyToOne
    @JoinColumn(name = "phongban_id")
    public PHONGBAN phongban;


    @Column(name = "luong")
    public int luong;
}

