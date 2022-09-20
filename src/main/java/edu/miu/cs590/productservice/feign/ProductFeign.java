package edu.miu.cs590.productservice.feign;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProductFeign {

    @GetMapping("rest/v2/all")
    public List<Object> getProducts();
}
