package de.hs.furtwangen.bam.spots.service;

import de.hs.furtwangen.bam.spots.model.User;

public interface UserService {
	
	public User addUser(User user);
	
	public User findByUsername(String username);
	
	public User findOne(int id);
	
	public void save(User user);
	
	public void delete(int id);

}
