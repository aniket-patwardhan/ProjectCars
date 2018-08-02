package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BrandsService;

@RestController
@RequestMapping
public class BrandsController {
	
	@Autowired
	private BrandsService brandsService;
	
	@RequestMapping(value = "getBrands", method = RequestMethod.GET)
	public ResponseEntity<?> getBrands() {
		return brandsService.getBrands();
	}

}
