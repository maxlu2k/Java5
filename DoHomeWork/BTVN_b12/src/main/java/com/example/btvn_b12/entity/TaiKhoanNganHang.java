package com.example.btvn_b12.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tai_khoan_ngan_hang")
public class TaiKhoanNganHang {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "ma")
    private String ma;
    @Column(name = "ho_ten_chu_tai_khoan")
    private String hoTenChuTaiKhoan;
    @Column(name = "ten_ngan_hang")
    private String tenNganHang;
    @Column(name = "ten_chi_nhanh")
    private String tenChiNhanh;
    @Column(name = "dia_chi")
    private String diaChi;
    @Column(name = "ghi_chu")
    private String ghiChu;
    @Column(name = "trang_thai")
    private Integer trangThai;
    @Column(name = "ngay_tao")
    private Date ngayTao;
    @Column(name = "ngay_sua")
    private Date ngaySua;
}
