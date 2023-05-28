package com.example.btvn_b9.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "sinh_vien")
@Entity
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "lop_hoc_id")
    private Long lopHocId;
    @Column(name = "name")
    private String name;
    @Column(name = "mssv")
    private String mssv;
    @Column(name = "dia_chi")
    private String diaChi;

}
