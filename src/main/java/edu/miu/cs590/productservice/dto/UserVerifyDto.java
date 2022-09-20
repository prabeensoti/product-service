package edu.miu.cs590.productservice.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class UserVerifyDto {
    private String email;
}
