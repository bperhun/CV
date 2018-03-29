package ua.project.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category extends BaseEntity {

	@Column(name = "category")
	private String[] category;
	
	@OneToOne(mappedBy = "category", cascade = CascadeType.ALL, 
            fetch = FetchType.LAZY)
	UserEntity user;
	


	public Category() {

	}



	public String[] getCategory() {
		return category;
	}



	public void setCategory(String[] category) {
		this.category = category;
	}



//	public UserDetails getUserDetails() {
//		return userDetails;
//	}
//
//
//
//	public void setUserDetails(UserDetails userDetails) {
//		this.userDetails = userDetails;
//	}



	public UserEntity getUser() {
		return user;
	}



	public void setUser(UserEntity user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Category [category=" + Arrays.toString(category) + ", getId()=" + getId() + "]";
	}



}
