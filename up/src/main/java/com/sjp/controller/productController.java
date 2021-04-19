package com.sjp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjp.Repository.ProductRepo;
import com.sjp.Model.*;
import java.util.*;
@RestController
@RequestMapping("/api/k1")
public class productController {
	
	@Autowired
	private ProductRepo  repo;
	
	@PostMapping("/Product")
	public Product createProduct(@RequestBody Product prod)
	{
		
		return repo.save(prod);
	}
	
	@DeleteMapping("/Product{Id}")
	public  ResponseEntity<Product>deleteuser(Product prod)
	{
		repo.delete(prod);
		return ResponseEntity.ok(prod);
	}
	
	@GetMapping("/Product")
	public List<Product>getall()
	{
		return repo.findAll();
	}
	
	@PutMapping("/Product")
	
	

}
