package edu.miu.cs590.productservice.repository;

import edu.miu.cs590.productservice.entity.Product;
import edu.miu.cs590.productservice.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendorRepository extends JpaRepository<Vendor,Long> {
    List<Vendor> findAll();
    Vendor findById(long id);
}
