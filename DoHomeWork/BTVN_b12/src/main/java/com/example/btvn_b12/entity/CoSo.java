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
@Table(name = "co_so")
public class CoSo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "tai_khoan_ngan_hang_id", referencedColumnName = "id")
    private TaiKhoanNganHang taiKhoanNganHang;
    @Column(name = "ma")
    private String ma;
    @Column(name = "ten_co_so")
    private String tenCoSo;
    @Column(name = "ho_ten_nguoi_dai_dien")
    private String hoTenNguoiDaiDien;
    @Column(name = "ma_so_thue")
    private String maSoThue;
    @Column(name = "so_dien_thoai")
    private String soDienThoai;
    @Column(name = "email")
    private String email;
    @Column(name = "ghi_chu")
    private String ghiChu;
    @Column(name = "ten_tinh")
    private String tenTinh;
    @Column(name = "ten_thanh_pho")
    private String tenThanhPho;
    @Column(name = "ten_quan_huyen")
    private String tenQuanHuyen;
    @Column(name = "trang_thai")
    private String trangThai;
    @Column(name = "ngay_tao")
    private Date ngayTao;
    @Column(name = "ngay_chinh_sua")
    private Date ngayChinhSua;
}
