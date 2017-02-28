package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Idea implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String title;
	
	private Date publicationDate;
	
	private String description;
	
	private static final int VOTABLE_DAYS=7;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;

	@ManyToOne
	@JoinColumn(name="id_category")
	private Category category;
	
	@OneToOne
	@JoinColumn(name="id_illustration")
	private Illustration illustration;
	
	@OneToOne
	@JoinColumn(name="id_survey")
	private Survey survey;
	
	@OneToMany(mappedBy="idea")
	private List<Comment> comments;
	
	@OneToMany(mappedBy="idea")
	private List<Rating> ratings;
	
	
	public Idea() {
		super();
	}

	

	public Idea(String title, String description, Category category) {
		super();
		this.title = title;
		this.description = description;
		this.category = category;
	}


	public Idea(String title, String description, User user, Category category) {
		super();
		this.title = title;
		this.publicationDate = new Date();
		this.description = description;
		this.user = user;
		this.category = category;
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

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}



	public Illustration getIllustration() {
		return illustration;
	}



	public void setIllustration(Illustration illustration) {
		this.illustration = illustration;
	}



	public Survey getSurvey() {
		return survey;
	}



	public void setSurvey(Survey survey) {
		this.survey = survey;
	}



	public List<Comment> getComments() {
		return comments;
	}



	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}



	public List<Rating> getRatings() {
		return ratings;
	}



	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	
	
}
