package edu.miu.cs590.productservice.service;

import edu.miu.cs590.productservice.dto.VendorDto;
import edu.miu.cs590.productservice.entity.Vendor;

import java.util.List;

public interface VendorService {
    List<VendorDto> getAllVendors();
    VendorDto getVendorById(long id);

    VendorDto addVendor(VendorDto vendor);

    VendorDto updateVendor(VendorDto vendor);
    void deleteVendor(long id);
}
