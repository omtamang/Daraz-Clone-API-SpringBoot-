package com.darazClone.springboot.restfull_API_Daraz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.darazClone.springboot.restfull_API_Daraz.user.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer>{
	public List<UserDetails> findByUserName(String userName);

}
