package com.example.demojava5d3.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
    @NotEmpty
    @Min(value = 5)
    private String mssv;

    @Pattern(regexp = "[a-z A-Z]+")
    private String ten;

    @NotNull
    private Integer tuoi;
    private String diaChi;
    private Boolean gioiTinh;

    //xoá import thừa Ctrl+alt+o
    //format Ctrl+alt+l
}