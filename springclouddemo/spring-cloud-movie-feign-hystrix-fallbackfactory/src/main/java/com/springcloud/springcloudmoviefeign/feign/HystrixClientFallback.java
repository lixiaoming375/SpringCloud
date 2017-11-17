package com.springcloud.springcloudmoviefeign.feign;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.springcloud.springcloudmoviefeign.entity.User;

@Component
public class HystrixClientFallback implements UserFeignClient {

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return new User(new Long(11111),"test","test",(short) 1,new BigDecimal("11"));
	}


}
