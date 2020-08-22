package com.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserRepository;
import com.user.domain.Address;
import com.user.dto.UserRequest;

@Service

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	


	@Override
	public com.user.domain.User registerUser(UserRequest userRequest) {
		
		return  userRepo.save(populateUser(userRequest));
	}


	
	public Optional<com.user.domain.User> getUserByUserId(Long id) {
		return userRepo.findById(id);
	}

	public UserRepository getUserRepo() {
		return userRepo;
	}



	public void setUserRepo(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	private com.user.domain.User populateUser(UserRequest userRequest){
		
		com.user.domain.User user1 = new com.user.domain.User();
		user1.setFirstName(userRequest.getFirstName());
		user1.setLastName(userRequest.getLastName());
		user1.setEmailId(userRequest.getEmailId());
		user1.setMobilenumber(userRequest.getMobilenumber());
		List<Address> addList = new ArrayList<Address>();
		if(null != userRequest.getAddresses() && !userRequest.getAddresses().isEmpty()) {
			for(com.user.dto.Address address :userRequest.getAddresses()) {
			Address add = new Address();
			add.setUser(user1);
			add.setAddress1(address.getAddress());
			add.setCountryCode(address.getCountryCode());
			add.setStateCode(address.getState());
			addList.add(add);
			}
		}
		
		user1.setAddresses(addList);
		return user1;
	}

}
