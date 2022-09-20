package edu.miu.cs590.productservice.feign;

import edu.miu.cs590.productservice.dto.UserVerifyDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-service", url ="${user.service.url}")
public interface UserFeignClient {

    @PostMapping("/verify")
    Boolean verifyUserDetailsByUsername(@RequestBody UserVerifyDto userVerifyDto);
}
