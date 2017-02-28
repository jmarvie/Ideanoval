package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class User extends Visitor implements Serializable{


	private static final long serialVersionUID = 1L;

	
	@OneToMany(mappedBy = "user")
	private List<Idea> ideas;

	@OneToOne(mappedBy="user")
	private Alert alert;
	
	@OneToMany(mappedBy="user")
	private List<Comment> comments;
	
	@OneToMany(mappedBy="user")
	private List<Rating> ratings;
	

	/**
	 * 
	 */
	public User() {
		super();
	}

	
	public User(String email, String login, String password) {
		super();
		this.email = email;
		this.login = login;
		this.password = password;
	}

	
	
	

	

	
	


	
	
	
	

	
	
}
