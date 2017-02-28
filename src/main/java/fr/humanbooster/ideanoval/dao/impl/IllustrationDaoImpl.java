package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import fr.humanbooster.ideanoval.dao.IllustrationDao;

@Repository
@Primary
public class IllustrationDaoImpl implements IllustrationDao{
	
	@Autowired
	private SessionFactory sf;

	public IllustrationDaoImpl() {
		super();
	}

	public IllustrationDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	} 
	
	
}
