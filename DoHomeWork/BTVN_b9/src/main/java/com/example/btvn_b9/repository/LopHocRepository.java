package com.example.btvn_b9.repository;

import com.example.btvn_b9.entity.LopHoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LopHocRepository extends JpaRepository<LopHoc, Long> {
    @Query("SELECT l FROM LopHoc l WHERE l.name LIKE %?1% AND l.diaDiemLopHoc LIKE %?2%")
    Page<LopHoc> searchAll(String name, String diaDiem, Pageable pageable);
}
