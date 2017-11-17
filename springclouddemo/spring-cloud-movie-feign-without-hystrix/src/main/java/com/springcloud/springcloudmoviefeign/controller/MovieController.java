package com.springcloud.springcloudmoviefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.springcloudmoviefeign.feign.FeignClient2;
import com.springcloud.springcloudmoviefeign.feign.UserFeignClient;
import com.springcloud.springcloudmoviefeign.entity.User;

@RestController
public class MovieController {

  @Autowired
  private UserFeignClient userFeignClient;
  @Autowired
  private FeignClient2 feignClient2;

  @GetMapping("/movie/{id}")
  public User findById(@PathVariable Long id) {
    return this.userFeignClient.findById(id);
  }

  
  @GetMapping("/{serviceName}")
  public String findServiceInfoFromEurekaByServiceName(@PathVariable String serviceName) {
    return this.feignClient2.findServiceInfoFromEurekaByServiceName(serviceName);
  }

}
