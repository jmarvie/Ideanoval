package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.User;

public interface UserDao {
	
	public void addUser(User user);
	public User findUser(User user);
	public User findUserById(int idUser);
	public List<User> getAllUsers();

}
