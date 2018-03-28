package ua.project.service;

import java.util.List;

import ua.project.entity.UserDetails;
import ua.project.entity.UserEntity;



public interface UserService {

	void saveUser(UserEntity entity);
	
	
	
	UserEntity findUserById(int id);
	
	UserEntity findUserByEmail(String email);
	
	void updateUser(UserEntity entity);
	
	
	
	UserEntity findAllInf(String email);
	
	
	List<UserEntity> findAllUsers();



}
