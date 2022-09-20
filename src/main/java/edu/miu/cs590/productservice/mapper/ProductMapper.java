package edu.miu.cs590.productservice.mapper;

import edu.miu.cs590.productservice.dto.ProductDto;
import edu.miu.cs590.productservice.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    @Mappings({
            @Mapping(target = "vendorId",source = "vendor.id"),
            @Mapping(target = "categoryId",source = "category.id")
    })
    ProductDto toProductDto(Product product);

    @Mappings({
            @Mapping(source = "vendorId",target = "vendor.id"),
            @Mapping(source = "categoryId",target = "category.id")
    })
    Product dtoToEntity(ProductDto productDto);
    List<ProductDto> toProductDtos(List<Product> products);
}
