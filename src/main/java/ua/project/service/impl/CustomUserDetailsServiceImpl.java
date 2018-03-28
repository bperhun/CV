package ua.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ua.project.entity.UserEntity;
import ua.project.mapper.UserMapper;
import ua.project.repository.UserRepository;



@Service("userDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity entity = userRepository.findUserByEmail(email);
		if(entity == null) throw new UsernameNotFoundException("User not found");
		
		return UserMapper.toSecurityUser(entity);
	}

}