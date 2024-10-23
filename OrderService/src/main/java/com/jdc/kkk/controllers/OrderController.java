package com.jdc.kkk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.jdc.kkk.entity.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/getProduct")
	public String getCreatedProductUsingRestTemplate() {
		String productURL="http://localhost:8081/products/create";
		
	     Product product=restTemplate.getForObject(productURL,Product.class);
		return "Product Name is :"+product.getName();
	}

}
