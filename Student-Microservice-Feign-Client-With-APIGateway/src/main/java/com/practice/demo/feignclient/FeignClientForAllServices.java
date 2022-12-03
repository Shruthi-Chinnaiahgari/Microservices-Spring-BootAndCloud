package com.practice.demo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practice.demo.response.AddressResponse;

// This is used if not registered with eureka -- @FeignClient(url="${address.service.url}", value="address-feign-client")
@FeignClient(value="api-gateway")
public interface FeignClientForAllServices {
	
	@GetMapping("/address-service//api/address/getAddress/{id}")
	public AddressResponse getAddressById(@PathVariable long id);

}
