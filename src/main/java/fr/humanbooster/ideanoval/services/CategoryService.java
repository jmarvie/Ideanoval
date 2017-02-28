package fr.humanbooster.ideanoval.services;

import java.util.List;

import fr.humanbooster.ideanoval.business.Category;

public interface CategoryService {

	public List<Category> getAllCategories();
	public Category getCategoryById(int id);
	
}
