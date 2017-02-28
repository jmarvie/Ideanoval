package fr.humanbooster.ideanoval.services;

import java.util.List;

import fr.humanbooster.ideanoval.business.User;

public interface UserService {

	public User addUser(User user);
	public User openSession(User user);
	public User findUserById(String attribute);
	public List<User> getAllUsers();
	
	
	
}
