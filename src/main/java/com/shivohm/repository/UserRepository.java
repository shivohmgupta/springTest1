package com.shivohm.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.shivohm.model.*;


public interface UserRepository extends MongoRepository<User, String> {
	
	@Override
	public List<User> findAll();

}
