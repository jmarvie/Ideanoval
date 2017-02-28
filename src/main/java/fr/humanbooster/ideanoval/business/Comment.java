package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	private String content;
	
	private Date publicationDate;
	
	private boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="id_idea")
	private Idea idea;

	
	public Comment() {
		super();
	}


	public Comment(String title, String content, Date publicationDate) {
		super();
		this.title = title;
		this.content = content;
		this.publicationDate = publicationDate;
	}

	
	public Comment(int id, String title, String content, Date publicationDate, boolean isActive, User user, Idea idea) {
		super();
		this.title = title;
		this.content = content;
		this.publicationDate = publicationDate;
		this.isActive = isActive;
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


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getPublicationDate() {
		return publicationDate;
	}


	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
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
