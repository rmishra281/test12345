package com.user.service;

import java.util.Optional;

public interface UserService {
	
	public com.user.domain.User registerUser(com.user.dto.UserRequest userRequest) ;
	public Optional<com.user.domain.User> getUserByUserId(Long id);

}
