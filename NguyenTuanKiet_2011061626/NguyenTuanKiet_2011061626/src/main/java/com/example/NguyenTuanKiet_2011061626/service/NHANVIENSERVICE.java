package com.example.NguyenTuanKiet_2011061626.service;

import com.example.NguyenTuanKiet_2011061626.entity.NHANVIEN;
import com.example.NguyenTuanKiet_2011061626.repository.INHANVIENRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NHANVIENSERVICE {
    @Autowired
    private INHANVIENRepository nhanvienRepository;

    public List<NHANVIEN> getAllNHANVIENs(){
        return nhanvienRepository.findAll();
    }


    public void addNHANVIEN(NHANVIEN nhanvien){
        nhanvienRepository.save(nhanvien);
    }

    public void updateNHANVIEN(NHANVIEN nhanvien){
        nhanvienRepository.save(nhanvien);
    }
    public void deleteNHANVIEN(Long Ma_NV){
        nhanvienRepository.deleteById(Ma_NV);
    }
}
