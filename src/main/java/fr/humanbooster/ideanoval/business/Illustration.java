package fr.humanbooster.ideanoval.business;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Illustration implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String lien;
	private int poids;
	private String format;
	private String resolution;
	
	@OneToOne(mappedBy="illustration")
	private Idea idea;

	
	public Illustration() {
		super();
	}

	public Illustration(String lien, int poids, String format, String resolution) {
		super();
		this.lien = lien;
		this.poids = poids;
		this.format = format;
		this.resolution = resolution;
	}

	public Illustration(String lien, int poids, String format, String resolution, Idea idea) {
		super();
		this.lien = lien;
		this.poids = poids;
		this.format = format;
		this.resolution = resolution;
		this.idea = idea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Idea getIdea() {
		return idea;
	}

	public void setIdea(Idea idea) {
		this.idea = idea;
	}
	
	
	
	

}
