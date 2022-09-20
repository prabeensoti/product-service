package edu.miu.cs590.productservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VendorDto {
    private String name;
    private String contact;
    private String email;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private Long zip;
    private String country;
}
