package edu.miu.cs590.productservice.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "product-service")
public interface ProductFeignProxy extends ProductFeign{
}
