package edu.miu.cs590.productservice.repository;

import edu.miu.cs590.productservice.config.ProductConfiguration;
import edu.miu.cs590.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();
    Product findById(long id);

}
