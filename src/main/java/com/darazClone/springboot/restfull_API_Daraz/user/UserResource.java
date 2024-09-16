package com.darazClone.springboot.restfull_API_Daraz.user;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.darazClone.springboot.restfull_API_Daraz.repository.UserRepository;

@RestController
public class UserResource {
	
	private UserRepository userRepository;

	public UserResource(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	public List<UserDetails> retrieveAllUsers(){
		return userRepository.findAll();
	}  
	
	@PostMapping("/user")
	public void addUser(@RequestBody UserDetails userDetails) {
		userRepository.save(userDetails);
	}
	
	@GetMapping("/users/{userName}")
	public List<UserDetails> findUser(@PathVariable String userName) {
		return userRepository.findByUserName(userName);
	}
	
	@GetMapping("/users/{id}/carts")
	public List<Cart> retriveCartOfUser(@PathVariable int id){
		java.util.Optional<UserDetails> userDetails = userRepository.findById(id);
		
		return userDetails.get().getCart();
	}
}
