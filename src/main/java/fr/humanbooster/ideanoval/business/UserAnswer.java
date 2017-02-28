package fr.humanbooster.ideanoval.business;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserAnswer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String content;
	
	private String openText;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="id_survey")
	private Survey survey;

	
	public UserAnswer() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getOpenText() {
		return openText;
	}


	public void setOpenText(String openText) {
		this.openText = openText;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Survey getSurvey() {
		return survey;
	}


	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	
	
	
	

}
