package com.hibe1.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import java.util.List;



import org.hibernate.*;

import com.hibe1.bean.User;

public class UserDaoImpl implements UserDao{

	Session session= new AnnotationConfiguration().configure("hibe1.cfg.xml").buildSessionFactory().openSession();
	Transaction t=null;
	Query q=null;
	
	@Override
	public void reg(User user) {
		
		
			
			
		t= session.beginTransaction();
			
			session.persist(user);
			
			t.commit();
			session.close();
		
	//int	id=user.getId();
	//	return id;
		
	}

	@Override
	public void update(User user) {
		
		t=session.beginTransaction();
		
		q=session.createQuery("update User set firstName=:fn,lastName=:ln where id=:i");
		q.setParameter("fn",user.getFirstName());
		q.setParameter("ln",user.getLastName());
		q.setParameter("i", user.getId());
		
		int status=q.executeUpdate();
		System.out.println(status);
		
		t.commit();
		
		session.close();
		
		
	}

	@Override
	public void delete(int id) {
		
		t=session.beginTransaction();
		
		q=session.createQuery("delete from User where id=:i");
		q.setParameter("i",id );
		
		int status=q.executeUpdate();
		
		System.out.println(status);
		t.commit();
		session.close();
		
	}

	@Override
	public User getUser(int id) {
	//	User user=null;
		System.out.println(id);
		t=session.beginTransaction();
		
		q=session.createQuery("from User where id=:i");
		q.setParameter("i", id);
		//q.setFirstResult(id);
		//q.setMaxResults(1);
		
		List list=q.list();
		User user=(User)list.get(0);
		
	return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list=null;
		// TODO Auto-generated method stub
		t=session.beginTransaction();
		q=session.createQuery("from User");
		list=q.list();
		
		return list;
	}

}
