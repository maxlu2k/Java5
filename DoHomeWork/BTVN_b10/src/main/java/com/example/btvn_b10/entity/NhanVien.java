package com.example.btvn_b10.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "nhan_vien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "ho")
    private String ma;
    @Column(name = "ten")
    private String ten;
    @Column(name = "tendem")
    private String tenDem;
    @Column(name = "gioitinh")
    private String gioiTinh;
    @Column(name = "NgaySinh")
    private Date ngaySinh;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "MatKhau")
    private String matKhau;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCH",referencedColumnName = "Id")
    private CuaHang cuaHang;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCV",referencedColumnName = "Id")
    private ChucVu chucVu;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdGuiBC")
    private NhanVien guiBaoCao;
    @Column(name = "TrangThai")
    private Integer trangThai;

}
