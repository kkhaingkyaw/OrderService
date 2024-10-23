package com.jdc.kkk.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.kkk.entity.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@GetMapping("/create")
	public Product createProduct() {
		return new Product((long) 1,"Ice");
	}
	

}
