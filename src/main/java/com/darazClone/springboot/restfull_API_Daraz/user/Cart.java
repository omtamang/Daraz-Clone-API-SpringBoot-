package com.darazClone.springboot.restfull_API_Daraz.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cart {
	
	protected Cart() {
		
	}
	
	@Id
	@GeneratedValue
	private int id;
	
	private int quantity;
	private String title;
	private String price;
	private String product_link;
	private String image_link;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private UserDetails userDetails;
	
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getProduct_link() {
		return product_link;
	}
	public void setProduct_link(String product_link) {
		this.product_link = product_link;
	}
	public String getImage_link() {
		return image_link;
	}
	public void setImage_link(String image_link) {
		this.image_link = image_link;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", quantity=" + quantity + ", title=" + title + ", price=" + price + ", product_link="
				+ product_link + ", image_link=" + image_link + "]";
	}
	
}
