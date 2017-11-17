package com.springcloud.springcloudmoviefeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.springcloud.config.UserFeignConfig;
import com.springcloud.springcloudmoviefeign.entity.User;

import feign.Param;
import feign.RequestLine;

@FeignClient(name="spring-cloud-user",configuration=UserFeignConfig.class,fallback=FallBackForUser.class)
public interface UserFeignClient {
  @RequestLine("GET /simple/{id}")
  public User findById(@Param("id") Long id);
 
}
