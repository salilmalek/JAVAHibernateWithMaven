package com.apex.myhibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

import com.apex.myhibernate.util.HibernateUtil;
import com.apex.myhibernate.vo.Order;

public class OrderDAO {

	public List<Order> readOrder(){
		//Order order=new Order();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Order> lst = session.createCriteria(Order.class).list();
		return lst;
	}
	public void saveOrder(Order order){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(order);
		tx.commit();
		session.close();
		System.out.println("Successfully created " + order.toString());
	}
	
	public void updateOrder(Order order){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(order);
		tx.commit();
		session.close();
	}
	
	public void deleteOrder(Order order){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.delete(order);
		tx.commit();
		session.close();
	}
}
