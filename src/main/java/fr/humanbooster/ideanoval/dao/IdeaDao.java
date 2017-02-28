package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.Idea;
import fr.humanbooster.ideanoval.business.Rating;
import fr.humanbooster.ideanoval.business.User;

public interface IdeaDao {
	
	public List<Idea> getAllIdeas();
	public void addIdea(Idea idea);
	public Idea getIdeaById(int id);
	public void rateIdea(Rating rating);

}
