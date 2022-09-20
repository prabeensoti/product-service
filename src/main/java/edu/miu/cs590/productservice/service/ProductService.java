package edu.miu.cs590.productservice.service;

import edu.miu.cs590.productservice.dto.ProductDto;
import edu.miu.cs590.productservice.entity.Product;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();
    ProductDto getProductById(long id);

    ProductDto addProduct(ProductDto product);

    ProductDto updateProduct(ProductDto product);
    void deleteProduct(long id);

}
