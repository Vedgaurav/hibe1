package com.hibe1.dao;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;
import com.hibe1.bean.User;


public interface UserDao {

	public void reg(User user);
	
	public void update(User user);
	
	public void delete(int id);
	
	public User getUser(int id);
	
	public List<User> getAllUser();
	
	
	
}
