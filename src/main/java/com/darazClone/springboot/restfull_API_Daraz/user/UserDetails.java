package com.darazClone.springboot.restfull_API_Daraz.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class UserDetails {
	
	public UserDetails() {
		
	}
	
	@Id
	@GeneratedValue
	private int id;
	
	private String userName;
	private String phoneNumber;
	private String password;
	
	@OneToMany(mappedBy = "userDetails")
	@JsonIgnore
	private List<Cart> cart;
	
	public UserDetails(int id, String userName, String phoneNumber, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	
	public List<Cart> getCart() {
		return cart;
	}

	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", password="
				+ password + "]";
	}
	
}
