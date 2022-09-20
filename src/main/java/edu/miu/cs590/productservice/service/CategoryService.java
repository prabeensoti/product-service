package edu.miu.cs590.productservice.service;

import edu.miu.cs590.productservice.dto.CategoryDto;
import edu.miu.cs590.productservice.dto.ProductDto;
import edu.miu.cs590.productservice.entity.Category;
import edu.miu.cs590.productservice.entity.Product;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategories();
    CategoryDto getCategoryById(long id);

    Category addCategory(Category category);

    Category updateCategory(long id, Category category);
    void deleteCategory(long id);
}
