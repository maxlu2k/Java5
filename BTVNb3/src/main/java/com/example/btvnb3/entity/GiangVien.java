package com.example.btvnb3.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
//@Builder(builderMethodName = "hiddenBuilder")
public class GiangVien {
    private static int nextId = 1;
    private Integer id;
    private String ma, ten;
    private Integer tuoi;
    private Boolean gioiTinh;
    private String diaChi;

    public GiangVien(String ma, String ten, Integer tuoi, Boolean gioiTinh, String diaChi) {
        this.id = nextId++;
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
//    public static class GiangVienBuilder {
//        public GiangVien build() {
//            GiangVien giangVien = hiddenBuilder().build();
//            giangVien.setId("GV" + nextId++);
//            return giangVien;
//        }
//    }

}
