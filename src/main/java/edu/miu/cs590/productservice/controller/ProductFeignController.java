package edu.miu.cs590.productservice.controller;

import edu.miu.cs590.productservice.feign.ProductFeign;
import edu.miu.cs590.productservice.feign.ProductFeignProxy;
import lombok.AllArgsConstructor;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableFeignClients(basePackageClasses = ProductFeignProxy.class)
@AllArgsConstructor
@RequestMapping("/feign")
public class ProductFeignController implements ProductFeign {

    private ProductFeignProxy productFeignProxy;

    @GetMapping("/rest/v2/all")
    @Override
    public List<Object> getProducts() {
        return productFeignProxy.getProducts();
    }
}
