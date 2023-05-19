package com.example.btvn_b5.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
@Builder
public class GiangVien {
    @NotBlank(message = "không để trống")
    private String maGV;
    @NotBlank(message = "không để trống")
    private String ten;
//    @NotBlank(message = "không để trống")
    @Pattern(regexp = "^[2-9][5-9]|[3-9]\\\\d+$", message = "Tuổi phải là số nguyên dương và lớn hơn 25")
    private String tuoi;
    @NotBlank(message = "không để trống")
    private String queQuan;

}
