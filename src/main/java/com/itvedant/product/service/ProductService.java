package com.itvedant.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itvedant.product.dao.AddProductDAO;
import com.itvedant.product.dao.UpdateProductDAO;
import com.itvedant.product.entity.Product;
import com.itvedant.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public Product createProduct(AddProductDAO addProductDAO) {
		
		Product product = new Product();
		
		product.setName(addProductDAO.getName());
		product.setPrice(addProductDAO.getPrice());
		product.setQuantity(addProductDAO.getQuantity());
		
		this.productRepository.save(product);
		
		return product;
	}
	
	
	public List<Product> readAllProducts(){
		
		List<Product> products = new ArrayList<Product>();
		
		products = this.productRepository.findAll();
		
		return products;
		
	}
	
	public Product findProductById(Integer id) {
		
		Product product = new Product();
		
		product = this.productRepository.findById(id).orElse(null);
		
		return product;
	}
	
	
	public Product updateProduct(Integer id, UpdateProductDAO updateProductDAO) {
		
		Product product = new Product();
		
		product = this.findProductById(id);
		
		if(updateProductDAO.getName() != null) {
			product.setName(updateProductDAO.getName());
		}
		if(updateProductDAO.getPrice() != null) {
			product.setPrice(updateProductDAO.getPrice());
		}
		if(updateProductDAO.getQuantity() != null) {
			product.setQuantity(updateProductDAO.getQuantity());
		}
		
		this.productRepository.save(product);
		
		return product;
	}
	
	public String deleteProduct(Integer id) {
		
		Product product = new Product();
		
		product = this.findProductById(id);
		
		this.productRepository.delete(product);
		
		return "Product Data Deleted";
		
	}
	
}

















