package me.dio.avanade.service;

import me.dio.avanade.model.User;

public interface UserService {
	
	public User findById(Long id) ;
	
	public User create (User userToCreate);
	

}
