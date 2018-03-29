package ua.project.domain;




import java.util.Arrays;
import java.util.List;

import ua.project.entity.Category;
import ua.project.enumeration.Role;


public class UserProfileRequest {
	
	private Integer id;
	private String email;
	private String firstName;
	private String lastName;
	private String phoneNumber; 
	private String country;
	private String district;
	private String[] category;
	private String imagePath;
	private Role role;
	private boolean isActivated;
	
	

	public UserProfileRequest() {
		
	}





	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	






	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}








	public String[] getCategory() {
		return category;
	}





	public void setCategory(String[] category) {
		this.category = category;
	}





	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}





	
	
}