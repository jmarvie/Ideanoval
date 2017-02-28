package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import fr.humanbooster.ideanoval.business.Category;
import fr.humanbooster.ideanoval.business.User;
import fr.humanbooster.ideanoval.dao.CategoryDao;

@Repository
@Primary
public class CategoryDaoImpl implements CategoryDao{
	
	
	@Autowired
	private SessionFactory sf;

	public CategoryDaoImpl() {
		super();
	}

	public CategoryDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	@Override
	public List<Category> getAllCategories() {
		List<Category> listCategories = sf.getCurrentSession().createQuery("FROM Category").getResultList();
		return listCategories;
	}

	@Override
	public Category getCategoryById(int id) {
		Category category = sf.getCurrentSession().byId(Category.class).load(id);
		return category;
	} 
	
	
	

}
