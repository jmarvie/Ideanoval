package fr.humanbooster.ideanoval.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.dao.IllustrationDao;
import fr.humanbooster.ideanoval.services.IllustrationService;

@Service
@Transactional
public class IllustrationServiceImpl implements IllustrationService{
	
	@Autowired
	private IllustrationDao ildao;
	

	public IllustrationServiceImpl() {
		super();
	}

	public IllustrationServiceImpl(IllustrationDao ildao) {
		super();
		this.ildao = ildao;
	}


	
	
	

}
