package ua.project.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.project.domain.SimpleFilter;
import ua.project.entity.UserEntity;



public interface UserService {

	void saveUser(UserEntity entity);
	
	
	
	UserEntity findUserById(int id);
	
	UserEntity findUserByEmail(String email);
	
	void updateUser(UserEntity entity);
	
	
	
	UserEntity findAllInf(String email);
	
	
	List<UserEntity> findAllUsers();

	Page<UserEntity> getPagebleUsers(
			int pageNumber,
			int pageSize,
			String sort,
			String sortByField);



}
