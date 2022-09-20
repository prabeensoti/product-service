package edu.miu.cs590.productservice.serviceimpl;

import edu.miu.cs590.productservice.dto.ProductDto;
import edu.miu.cs590.productservice.entity.Product;
import edu.miu.cs590.productservice.mapper.ProductMapper;
import edu.miu.cs590.productservice.repository.ProductRepository;
import edu.miu.cs590.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;


    @Override
    public List<ProductDto> getAllProducts() {
        try{
            List<Product> products = productRepository.findAll();
            return productMapper.toProductDtos(products);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ProductDto getProductById(long id) {
       return productMapper.toProductDto(productRepository.findById(id));
    }

    @Override
    public ProductDto addProduct(ProductDto product) {
        return  productMapper.toProductDto(productRepository.save(productMapper.dtoToEntity(product))) ;
    }

    @Override
    public ProductDto updateProduct(ProductDto product) {
        Product prd = productMapper.dtoToEntity(product);
        if(prd != null){
            return productMapper.toProductDto(productRepository.save(prd));
        }
        return null;
    }

    @Override
    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }
}
