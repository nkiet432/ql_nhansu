package com.example.NguyenTuanKiet_2011061626.repository;

import com.example.NguyenTuanKiet_2011061626.entity.PHONGBAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPHONGBANRepository extends JpaRepository<PHONGBAN, Long> {
}
