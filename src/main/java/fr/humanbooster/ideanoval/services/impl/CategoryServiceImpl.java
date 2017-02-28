package fr.humanbooster.ideanoval.services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Category;
import fr.humanbooster.ideanoval.dao.CategoryDao;
import fr.humanbooster.ideanoval.services.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDao cd;
	

	public CategoryServiceImpl() {
		super();
	}

	public CategoryServiceImpl(CategoryDao cd) {
		super();
		this.cd = cd;
	}

	@Override
	public List<Category> getAllCategories() {
		return cd.getAllCategories();
	}

	@Override
	public Category getCategoryById(int id) {
		Category category = cd.getCategoryById(id);
		return category;
	}
	
	

}
