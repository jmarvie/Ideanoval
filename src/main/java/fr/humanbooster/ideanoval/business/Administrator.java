package fr.humanbooster.ideanoval.business;

import java.io.Serializable;

import javax.persistence.Entity;


@Entity
public class Administrator extends Visitor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String role;
	

	public Administrator() {
		super();
	}


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}
