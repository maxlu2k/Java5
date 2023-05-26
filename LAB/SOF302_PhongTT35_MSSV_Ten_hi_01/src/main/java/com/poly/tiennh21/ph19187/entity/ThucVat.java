package com.poly.tiennh21.ph19187.entity;


import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ThucVat {

    @NotEmpty(message = "không để trống")
    private String ma;
    @NotEmpty(message = "không để trống")
    private String ten;
    private Boolean gioiTinh;
    @NotNull(message = "không để trống")
    @Min(value = 150,message = "chiều cao phải lướn hơn 150")
    private Integer chieuCao;
    @NotEmpty(message = "không để trống")
    private String loai;
}
