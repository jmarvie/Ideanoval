package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String description;

	@OneToMany(mappedBy="category")
	private List<Idea> ideas;
	
	
	
	public Category() {
		super();
	}


	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
	public Category(String name, String description, List<Idea> ideas) {
		super();
		this.name = name;
		this.description = description;
		this.ideas = ideas;
	}


	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public List<Idea> getIdeas() {
		return ideas;
	}


	public void setIdeas(List<Idea> ideas) {
		this.ideas = ideas;
	}


	@Override
	public String toString() {
		return name + " : " + description;
	}
	
	
	

}
