package com.springcloud.springcloudmoviefeign.feign;

import org.springframework.stereotype.Component;

@Component
public class FallbackForClient2 implements FeignClient2 {

	@Override
	public String findServiceInfoFromEurekaByServiceName(String serviceName) {
		// TODO Auto-generated method stub
		return "haha";
	}

}
