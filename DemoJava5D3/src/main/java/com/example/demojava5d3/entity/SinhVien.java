package com.example.demojava5d3.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder //có thể tạo ra contructor có nhiều tham số
public class SinhVien {
    private String mssv, ten;
    private Integer tuoi;
    private String diaChi;
    private Boolean gioiTinh;

    //xoá import thừa Ctrl+alt+o
    //format Ctrl+alt+l
}