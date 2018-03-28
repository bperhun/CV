package ua.project.domain;

import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;




import ua.project.validator.CheckPasswordsMatch;
import ua.project.validator.CkeckIfUserEmailExist;


@CheckPasswordsMatch
public class RegisterRequest {

	@Pattern(regexp = "[a-zA-Z].+[a-zA-Z0-9+.]+@[A-Za-z]{2,5}+.[A-Za-z]{2,4}$", message = "Typed email has not correct format")
	@CkeckIfUserEmailExist
	@NotEmpty private String email;
	@NotEmpty(message = "bla") private String password;
	@NotEmpty(message = "bla") private String passwordConfirmation;
	
	public RegisterRequest() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}
	
	
}