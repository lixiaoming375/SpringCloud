package com.springcloud.springcloudmoviefeign.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.springcloud.springcloudmoviefeign.entity.User;

import feign.hystrix.FallbackFactory;

@Component
public class HystrixClientFallbackFactory implements  FallbackFactory<UserFeignClient>{

	private static final Logger LOGGER=LoggerFactory.getLogger(HystrixClientFallbackFactory.class);
	
	@Override
	public UserFeignClient create(Throwable cause) {
		
		LOGGER.info("fallback reason is:{}"+cause.getMessage());
		// TODO Auto-generated method stub
		return new UserFeginClientInterface() {
			@Override
			public User findById(Long id) {
				// TODO Auto-generated method stub
				User user=new User();
				user.setId(0L);
				return user;
			}
		};
	}

}
