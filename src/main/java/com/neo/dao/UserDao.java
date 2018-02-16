package com.neo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	default public boolean insertUser(User user) {
		return saveAndFlush(user) != null ? true : false;
	}
	
	default public User getUser(Integer empId) {
		return getOne(empId);
	}
	
	default public List<User> getAllUser() {
		return findAll();
	}
	
	default public User updateUser(User user) {
		return saveAndFlush(user);
	}
	
	default public boolean deleteUser(Integer empId) {
		delete(empId);
		return true;
	}
}
