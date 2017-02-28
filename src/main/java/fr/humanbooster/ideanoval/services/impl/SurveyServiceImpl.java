package fr.humanbooster.ideanoval.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Survey;
import fr.humanbooster.ideanoval.dao.SurveyDao;
import fr.humanbooster.ideanoval.services.SurveyService;

@Service
@Transactional
public class SurveyServiceImpl implements SurveyService{

	@Autowired
	private SurveyDao surdao;

	@Override
	public void addSurvey(Survey survey) {
		surdao.addSurvey(survey);	
	}

	
	
}
