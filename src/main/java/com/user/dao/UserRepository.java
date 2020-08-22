package com.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.user.domain.User;


public interface UserRepository extends CrudRepository<User,Long > {

}
