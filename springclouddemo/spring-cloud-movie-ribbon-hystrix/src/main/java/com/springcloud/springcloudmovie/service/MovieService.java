package com.springcloud.springcloudmovie.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.springcloudmovie.entity.User;

@Service
public class MovieService {

  @Autowired
  private RestTemplate restTemplate;
  
  
  @HystrixCommand(fallbackMethod="fallbackTest")
  public User testHystrix(@PathVariable Long id) {
    return this.restTemplate.getForObject("http://spring-cloud-user/simple/" + id, User.class);
  }
  
  public User fallbackTest(Long id){
	  return new User(new Long(11111),"test","test",(short) 1,new BigDecimal("11"));
  }
  
	
}
