package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import fr.humanbooster.ideanoval.business.Idea;
import fr.humanbooster.ideanoval.business.Rating;
import fr.humanbooster.ideanoval.business.User;
import fr.humanbooster.ideanoval.dao.IdeaDao;

@Repository
@Primary
public class IdeaDaoImpl implements IdeaDao {
	
	@Autowired
	private SessionFactory sf;

	
	public IdeaDaoImpl() {
		super();
	}

	public IdeaDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	@Override
	public List<Idea> getAllIdeas() {
		List<Idea> listIdeas = sf.getCurrentSession().createQuery("FROM Idea").getResultList();
		return listIdeas;
	}

	@Override
	public void addIdea(Idea idea) {
		sf.getCurrentSession().save(idea);
	}

	@Override
	public Idea getIdeaById(int id) {
		Idea idea = sf.getCurrentSession().byId(Idea.class).load(id);
		return idea;
	}

    @Override
    public void rateIdea(Rating rating) {
        sf.getCurrentSession().save(rating);  
    } 
	
	
	
	
	
	

}
