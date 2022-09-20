package edu.miu.cs590.productservice.mapper;

import edu.miu.cs590.productservice.dto.CategoryDto;
import edu.miu.cs590.productservice.dto.ProductDto;
import edu.miu.cs590.productservice.dto.VendorDto;
import edu.miu.cs590.productservice.entity.Category;
import edu.miu.cs590.productservice.entity.Product;
import edu.miu.cs590.productservice.entity.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendorMapper {
    @Mappings({
            @Mapping(target = "address1", source = "address.address1"),
            @Mapping(target = "address2", source = "address.address2"),
            @Mapping(target = "city", source = "address.city"),
            @Mapping(target = "state", source = "address.state"),
            @Mapping(target = "zip", source = "address.zip"),
            @Mapping(target = "country", source = "address.country")
    })
    VendorDto toVendorDto(Vendor vendor);

    @Mappings({
            @Mapping(source = "address1", target = "address.address1"),
            @Mapping(source = "address2", target = "address.address2"),
            @Mapping(source = "city", target = "address.city"),
            @Mapping(source = "state", target = "address.state"),
            @Mapping(source = "zip", target = "address.zip"),
            @Mapping(source = "country", target = "address.country")
    })
    Vendor dtoToEntity(VendorDto vendorDto);

    List<VendorDto> toVendorDtos(List<Vendor> vendors);
}
