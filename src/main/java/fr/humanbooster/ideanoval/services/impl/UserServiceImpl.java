package fr.humanbooster.ideanoval.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.User;
import fr.humanbooster.ideanoval.dao.UserDao;
import fr.humanbooster.ideanoval.services.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao ud;

	
	public UserServiceImpl() {
		super();
	}

	
	public UserServiceImpl(UserDao ud) {
		super();
		this.ud = ud;
	}

	
	@Override
	public User addUser(User user) {
		ud.addUser(user);
		return user;
	}


	@Override
	public User openSession(User user) {
		User newUser=ud.findUser(user);
		return newUser;
	}


	@Override
	public User findUserById(String attribute) {
		User user = ud.findUserById(Integer.parseInt(attribute));
		return user;
	}


	@Override
	public List<User> getAllUsers() {
		List<User> users = ud.getAllUsers();
		return users;
	}


	
	

}
