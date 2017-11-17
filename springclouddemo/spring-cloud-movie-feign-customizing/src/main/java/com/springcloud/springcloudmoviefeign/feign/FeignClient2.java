package com.springcloud.springcloudmoviefeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springcloud.config.Configuration2;

@FeignClient(name="XXXX" ,url="http://localhost:6600/",configuration=Configuration2.class)
public interface FeignClient2 {

	@RequestMapping(value = "/eureka/apps/{serviceName}")
	public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);
}
