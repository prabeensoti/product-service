package edu.miu.cs590.productservice.repository;

import edu.miu.cs590.productservice.entity.Category;
import edu.miu.cs590.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    List<Category> findAll();
    Category findById(long id);
}
