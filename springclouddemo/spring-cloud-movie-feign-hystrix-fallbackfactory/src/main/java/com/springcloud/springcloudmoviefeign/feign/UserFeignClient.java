package com.springcloud.springcloudmoviefeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcloud.springcloudmoviefeign.entity.User;

//@FeignClient(name="spring-cloud-user",fallback=HystrixClientFallback.class)
@FeignClient(name="spring-cloud-user",fallbackFactory=HystrixClientFallbackFactory.class)
public interface UserFeignClient {
  @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
  public User findById(@PathVariable("id") Long id); 
}
