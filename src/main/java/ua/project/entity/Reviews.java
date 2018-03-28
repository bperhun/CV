package ua.project.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Reviews extends BaseEntity {
	
	@Column(name = "reviews")
	private String reviews;
	
	@OneToMany(mappedBy = "reviews", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	List<UserEntity> user = new ArrayList<>();
	
	@OneToMany(mappedBy = "reviews", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	List<Client> client = new ArrayList<>();
	
	public Reviews(){
		
	}

	public Reviews(String reviews) {
		super();
		this.reviews = reviews;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	

	public List<UserEntity> getUser() {
		return user;
	}

	public void setUser(List<UserEntity> user) {
		this.user = user;
	}

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Reviews [reviews=" + reviews + ", getId()=" + getId() + "]";
	}
	
	
	
}
