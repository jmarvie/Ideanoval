package fr.humanbooster.ideanoval.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Idea;
import fr.humanbooster.ideanoval.business.Rating;
import fr.humanbooster.ideanoval.dao.IdeaDao;
import fr.humanbooster.ideanoval.services.IdeaService;


@Service
@Transactional
public class IdeaServiceImpl implements IdeaService{
	
	@Autowired
	private IdeaDao idao;

	public IdeaServiceImpl() {
		super();
	}

	public IdeaServiceImpl(IdeaDao idao) {
		super();
		this.idao = idao;
	}

	@Override
	public List<Idea> getAllIdeas() {
		List<Idea> listIdeas = idao.getAllIdeas();
		return listIdeas;
	}

	@Override
	public void addIdea(Idea idea) {
		idao.addIdea(idea);
	}

	@Override
	public Idea getIdeaById(int id) {
		Idea idea = idao.getIdeaById(id);
		return idea;
	}

    @Override
    public void rateIdea(Rating rating) {
        idao.rateIdea(rating);    
    }
	
	
	
	
	

}
