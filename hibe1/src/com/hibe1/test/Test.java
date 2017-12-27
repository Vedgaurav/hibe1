package com.hibe1.test;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.hibe1.bean.User;
import com.hibe1.bean.Packag;

import com.hibe1.bean.UserPack;
import com.hibe1.dao.UserDao;
import com.hibe1.dao.UserDaoImpl;

public class Test {

	public static void main(String[] args) {
		
		//Session session = new AnnotationConfiguration().configure("hibe1.cfg.xml").buildSessionFactory().openSession();
		
		//Transaction t= session.beginTransaction();
		
		User u = new User();
		//u.setFirstName("Radha");
		//u.setLastName("Krsna");//-----------------------------------------------------------1st part
		
		/*u.setFirstName("RadhaKrishna");
		u.setLastName("HareKrishna");*///------------------------------------------------------2ndpart
		
		/*u.setFirstName("Shyam");
		u.setLastName("Sundar");
		u.setId(9);*///-------------------------------------------------------------------------3rd part
		//-------------------------------------------------------------------------------------1st part
		/*Packag p= new Packag();
		p.setDes("Mayapur");
		p.setRate(1600);
		
		UserPack up= new UserPack();
		up.setPack(p);
		up.setUser_id(u);
		
		session.persist(u);
		session.persist(p);
		session.persist(up);
		
		t.commit();
		session.close();*/
		//--------------------------------------------------------------------------------------1st part end
		UserDao dao= new UserDaoImpl();
		//---------------------------------------------------------------------------------------2nd part
		/*dao.reg(u);
		
		System.out.println("insertion success");
		System.out.println(u.getId());
		*/
		//---------------------------------------------------------------------------------------2nd part end
		
		//dao.update(u);-------------------------------------------------------------------------3rd part
		
		//dao.delete(9);-------------------------------------------------------------------------4th part
		
		/*u=dao.getUser(3);
		System.out.println(u.getId()+u.getFirstName()+u.getLastName());
				*///-------------------------------------------------------------------------------5th part
		List<User> list=dao.getAllUser();
		
		for(User user:list)
		System.out.println(user.getId()+"\t"+user.getFirstName()+"\t"+user.getLastName());
	}
}
