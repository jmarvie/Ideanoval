package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import fr.humanbooster.ideanoval.business.Survey;
import fr.humanbooster.ideanoval.dao.SurveyDao;

@Repository
@Primary
public class SurveyDaoImpl implements SurveyDao{

	@Autowired
	private SessionFactory sf;
	
	
	public SurveyDaoImpl() {
		super();
	}

	
	public SurveyDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}


	@Override
	public Survey addSurvey(Survey survey) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(survey);
		return survey;
	}

	
}
