package ua.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import ua.project.entity.Category;
import ua.project.entity.UserEntity;
import ua.project.enumeration.Role;
import ua.project.repository.UserRepository;


@SpringBootApplication
public class MyProjectApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MyProjectApplication.class);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyProjectApplication.class, args);
		addAdmin(context);
	}
	
	static void addAdmin(ConfigurableApplicationContext context) {
		String adminEmail = "bogdankboy@gmail.com";
		String adminPassword = "bodya10v";
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		UserEntity entity = userRepository.findUserByEmail(adminEmail);
		if(entity == null) {
			PasswordEncoder encoder = context.getBean(PasswordEncoder.class);
			
			entity = new UserEntity();
			entity.setEmail(adminEmail);
			entity.setPassword(encoder.encode(adminPassword));
			entity.setRole(Role.ROLE_ADMIN);
			entity.setActivated(true);
			entity.setUserDetails(new ua.project.entity.UserDetails());
//			entity.getUserDetails().setCategory(new Category());
			entity.setCategory(new Category());
			
			
			
			userRepository.save(entity);
		}
	}
	
}
