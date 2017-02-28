package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.Category;

public interface CategoryDao {
	
	public List<Category> getAllCategories();
	public Category getCategoryById(int id);

}
