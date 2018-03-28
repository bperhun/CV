package ua.project.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.project.service.UserService;



@Component
public class CkeckIfUserEmailExistValidator implements ConstraintValidator<CkeckIfUserEmailExist, String>{

	@Autowired private UserService userService;
	
	@Override
	public void initialize(CkeckIfUserEmailExist arg0) {
		
		
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		
		return userService.findUserByEmail(email) != null ? false : true;
	}

}