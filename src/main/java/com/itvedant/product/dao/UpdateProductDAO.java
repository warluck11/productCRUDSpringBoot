package com.itvedant.product.dao;

public class UpdateProductDAO {
	
	private String name;
	private Float price;
	private Integer quantity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "UpdateProductDAO [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
