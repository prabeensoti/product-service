package edu.miu.cs590.productservice.serviceimpl;


import edu.miu.cs590.productservice.dto.CategoryDto;
import edu.miu.cs590.productservice.entity.Category;
import edu.miu.cs590.productservice.mapper.CategoryMapper;
import edu.miu.cs590.productservice.repository.CategoryRepository;
import edu.miu.cs590.productservice.repository.CategoryRepository;
import edu.miu.cs590.productservice.service.CategoryService;
import edu.miu.cs590.productservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryMapper categoryMapper;


    @Override
    public List<CategoryDto> getAllCategories() {
        try{
            List<Category> categories = categoryRepository.findAll();
            return categoryMapper.toCategoryDtos(categories);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CategoryDto getCategoryById(long id) {
       return categoryMapper.toCategoryDto(categoryRepository.findById(id));
    }

    @Override
    public Category addCategory(Category category) {
        Category newCategory = new Category();
        newCategory.setName(category.getName());
        newCategory.setDescription(category.getDescription());
        return categoryRepository.save(newCategory);
    }

    @Override
    public Category updateCategory(long id, Category product) {
        Category prd = categoryRepository.findById(id);
        if(prd != null){
            prd.setDescription(product.getDescription());
            prd.setName(product.getName());

            categoryRepository.save(prd);
        }
        return prd;
    }

    @Override
    public void deleteCategory(long id) {
        categoryRepository.deleteById(id);
    }
}
