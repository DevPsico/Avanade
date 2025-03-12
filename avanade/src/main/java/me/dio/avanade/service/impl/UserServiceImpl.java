package me.dio.avanade.service.impl;

import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import me.dio.avanade.model.User;
import me.dio.avanade.repository.UserRespository;
import me.dio.avanade.service.UserService;

public class UserServiceImpl implements UserService {

	private final UserRespository userRepository;

	@Autowired
	public UserServiceImpl(UserRespository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		// TODO Auto-generated method stub

		if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {

			throw new IllegalArgumentException("Usuário já eixste ");
		}
		return userRepository.save(userToCreate);
	}
}