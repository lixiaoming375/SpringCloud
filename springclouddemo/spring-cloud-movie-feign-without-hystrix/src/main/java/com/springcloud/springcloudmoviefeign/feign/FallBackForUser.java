package com.springcloud.springcloudmoviefeign.feign;

import org.springframework.stereotype.Component;

import com.springcloud.springcloudmoviefeign.entity.User;


@Component
public class FallBackForUser implements UserFeignClient{

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setId(-1L);
		return user;
	}

}
