package com.springcloud.springcloudmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springcloud.springcloudmovie.entity.User;
import com.springcloud.springcloudmovie.service.MovieService;

@RestController
public class MovieController {
  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private MovieService movieService;

  @GetMapping("/movie/{id}")
  public User findById(@PathVariable Long id) {
    // http://localhost:7900/simple/
    // VIP virtual IP
    // HAProxy Heartbeat
    return this.restTemplate.getForObject("http://SPRING-CLOUD-USER/simple/" + id, User.class);
  }
  
  
  @GetMapping("/testHytrix/{id}")
  public User testHytrix(@PathVariable Long id){
	  return movieService.testHystrix(id);
  }
  
 
  
  

}
