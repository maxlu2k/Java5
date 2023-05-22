package com.poly.tiennh21.ph19187.entity;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@NoArgsConstructor
//@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
public class ThucVat {
    private static int index = 1;
    private Integer id;
    @NotEmpty(message = "Không để trống")
    private String loaiCay;
    @NotEmpty(message = "Không để trống")
    private String ten;
    @NotNull(message = "không để trống")
    @Min(value = 26, message = "Tuổi phải lớn hơn hoặc bằng 26")
    @Digits(integer = Integer.MAX_VALUE, fraction = 0, message = "Tuổi phải là số nguyên")
    private Integer tuoi;
    private Boolean gioiTinh;
    @NotEmpty(message = "Không để trống")
    private String khuVuc;

    public ThucVat(String loaiCay, String ten, Integer tuoi, Boolean gioiTinh, String khuVuc) {
        this.id = index++;
        this.loaiCay = loaiCay;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.khuVuc = khuVuc;
    }
}
