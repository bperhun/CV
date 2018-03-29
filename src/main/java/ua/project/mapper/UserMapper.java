package ua.project.mapper;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import ua.project.domain.RegisterRequest;
import ua.project.domain.UserProfileRequest;
import ua.project.entity.UserDetails;
import ua.project.entity.UserEntity;
import ua.project.enumeration.Role;



public interface UserMapper {

	public static User toSecurityUser(UserEntity entity) {
		return new User(entity.getEmail(), entity.getPassword(), AuthorityUtils.createAuthorityList(String.valueOf(entity.getRole())));
	}
	
	public static UserEntity registerToEntity(RegisterRequest request) {
		UserEntity entity = new UserEntity();
		entity.setEmail(request.getEmail());
		entity.setPassword(request.getPassword());
		entity.setRole(Role.ROLE_USER);
		
		return entity;
		
	}
	
	public static UserProfileRequest entityToUserProfile(UserEntity entity) {
		UserProfileRequest request = new UserProfileRequest();
		request.setId(entity.getId());
		request.setEmail(entity.getEmail());
		request.setRole(entity.getRole());
		request.setActivated(entity.isActivated());
		request.setImagePath(entity.getImagePath());
		request.setLastName(entity.getUserDetails().getLastName());
		request.setFirstName(entity.getUserDetails().getFirstName());
		request.setPhoneNumber(entity.getUserDetails().getPhoneNumber());
		request.setCountry(entity.getUserDetails().getCountry());
		request.setDistrict(entity.getUserDetails().getDistrict());
		request.setCategory(entity.getCategory().getCategory());
	
	
		
		
		return request;
	}
	

	
}