package edu.miu.cs590.productservice.mapper;

import edu.miu.cs590.productservice.dto.CategoryDto;
import edu.miu.cs590.productservice.dto.ProductDto;
import edu.miu.cs590.productservice.dto.VendorDto;
import edu.miu.cs590.productservice.entity.Category;
import edu.miu.cs590.productservice.entity.Product;
import edu.miu.cs590.productservice.entity.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {
    CategoryDto toCategoryDto(Category category);
    List<CategoryDto> toCategoryDtos(List<Category> categories);
}
