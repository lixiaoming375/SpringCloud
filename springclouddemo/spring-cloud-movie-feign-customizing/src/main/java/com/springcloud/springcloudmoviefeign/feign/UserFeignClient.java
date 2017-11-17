package com.springcloud.springcloudmoviefeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.springcloud.config.MyConfiguration;
import com.springcloud.springcloudmoviefeign.entity.User;

import feign.Param;
import feign.RequestLine;

@FeignClient(name="spring-cloud-user",configuration=MyConfiguration.class)
public interface UserFeignClient {

  @RequestLine("GET /simple/{id}")//MyConfiguration中自定义使用feign使用 feignContract Default 此处不能在使用springMVC的注解
  public User findById(@Param("id") Long id); 
  

}
