package ua.project.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ua.project.enumeration.Role;



@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;
	
	private String token;
	
	private Role role;
	
	@Column(name = "is_activated")
	private boolean isActivated;
	
	@Column(name = "image_path")
	private String imagePath;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_details_id")
	UserDetails userDetails;

	

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinColumn(name = "review_id_user")
	Reviews reviews;
	
	@ManyToMany
	@JoinTable(name = "ordering", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "client_id"))
	List<Client> clients1 = new ArrayList<>();
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	Category category;

	public UserEntity() {

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

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	

	public List<Client> getClients1() {
		return clients1;
	}

	public void setClients1(List<Client> clients1) {
		this.clients1 = clients1;
	}
	

	public Reviews getReviews() {
		return reviews;
	}

	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}

	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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
	
	
	

	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	


	@Override
	public String toString() {
		return "User [login=" + email + ", password=" + password + ", getId()=" + getId() + "]";
	}

}