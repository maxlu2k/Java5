package com.example.btvn_b11.entity;

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
@Table(name = "phong_ban")
public class PhongBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "loai_phong_ban_id", referencedColumnName = "id")
    private LoaiPhongBan loaiPhongBan;
    @Column(name = "ma")
    private String ma;
    @Column(name = "ten")
    private String ten;
    @Column(name = "so_luong_phong_ban")
    private Integer soLuongPhongBan;
    @Column(name = "so_luong_nhan_vien")
    private Integer soLuongNhanVien;
    @Column(name = "ghi_chu")
    private String ghiChu;
    @Column(name = "trang_thai")
    private Integer trangThai;
    @Column(name = "ngay_tao")
    private Date ngayTao;
    @Column(name = "ngay_chinh_sua")
    private Date ngayChinhSua;

}
