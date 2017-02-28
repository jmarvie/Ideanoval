package fr.humanbooster.ideanoval.services;

import java.util.List;

import fr.humanbooster.ideanoval.business.Idea;
import fr.humanbooster.ideanoval.business.Rating;

public interface IdeaService {
	
	public List<Idea> getAllIdeas();
	public void addIdea(Idea idea);
	public Idea getIdeaById(int id);
	public void rateIdea(Rating rating);

}
