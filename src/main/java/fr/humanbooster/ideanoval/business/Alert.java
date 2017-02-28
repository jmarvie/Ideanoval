package fr.humanbooster.ideanoval.business;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Alert implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	private String description;
	
	@OneToOne
	@JoinColumn(name="id_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="id_idea")
	private Idea idea;

	
	public Alert() {
		super();
	}

	public Alert(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public Alert(String title, String description, User user, Idea idea) {
		super();
		this.title = title;
		this.description = description;
		this.user = user;
		this.idea = idea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Idea getIdea() {
		return idea;
	}

	public void setIdea(Idea idea) {
		this.idea = idea;
	}
	
	
	
	
	
}
