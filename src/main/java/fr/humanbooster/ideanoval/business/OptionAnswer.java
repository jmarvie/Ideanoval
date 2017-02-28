package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class OptionAnswer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOption;
	
	private String content;
	
	@ManyToMany(mappedBy="options", fetch=FetchType.EAGER)
	private List<Survey> surveys = new ArrayList<Survey>();


	public OptionAnswer() {
		super();
	}


	public OptionAnswer(int idOption, String content, List<Survey> surveys) {
		super();
		this.idOption = idOption;
		this.content = content;
		this.surveys = surveys;
	}




	public int getIdOption() {
		return idOption;
	}


	public void setIdOption(int idOption) {
		this.idOption = idOption;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public List<Survey> getSurveys() {
		return surveys;
	}


	public void setSurveys(List<Survey> surveys) {
		this.surveys = surveys;
	}

	
	


}
