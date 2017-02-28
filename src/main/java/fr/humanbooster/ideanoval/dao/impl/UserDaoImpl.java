package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import fr.humanbooster.ideanoval.business.User;
import fr.humanbooster.ideanoval.dao.UserDao;

@Repository
@Primary
public class UserDaoImpl implements UserDao{	
	
	@Autowired
	private SessionFactory sf; 

	public UserDaoImpl() {
		super();
	}


	public UserDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	@Override
	public void addUser(User user) {
		sf.getCurrentSession().save(user);
		
	}
	

	@Override
	public User findUser(User user) {
		
		User newUser=(User) sf.getCurrentSession().createQuery("FROM User WHERE email= :email AND password= :password")
				.setParameter("email", user.getEmail()).setParameter("password", user.getPassword()).getResultList().get(0);
		return newUser;
		
	}


	@Override
	public User findUserById(int idUser) {
		User user = sf.getCurrentSession().byId(User.class).load(idUser);
		return user;
		
	}


	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users = sf.getCurrentSession().createQuery("FROM User").getResultList();
		return users;
	}

}
