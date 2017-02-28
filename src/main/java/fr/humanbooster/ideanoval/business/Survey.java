package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Survey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSurvey;
	
	private String question;
	
	@OneToOne(mappedBy="survey")
	private Idea idea;
	
	@ManyToMany
	@JoinTable(name="options_survey",
		joinColumns={@JoinColumn(name="id_survey", referencedColumnName="idSurvey")},
		inverseJoinColumns={@JoinColumn(name="id_option", referencedColumnName="idOption")})
	private List<OptionAnswer> options = new ArrayList<OptionAnswer>();
	

	public Survey() {
		super();
	}

	

	public Survey(int idSurvey, String question, Idea idea, List<OptionAnswer> options) {
		super();
		this.idSurvey = idSurvey;
		this.question = question;
		this.idea = idea;
		this.options = options;
	}



	public int getIdSurvey() {
		return idSurvey;
	}


	public void setIdSurvey(int idSurvey) {
		this.idSurvey = idSurvey;
	}


	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Idea getIdea() {
		return idea;
	}

	public void setIdea(Idea idea) {
		this.idea = idea;
	}

	
	public List<OptionAnswer> getOptions() {
		return options;
	}


	public void setOptions(List<OptionAnswer> options) {
		this.options = options;
	}
	
	
	
	
	

}
