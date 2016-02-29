package com.apex.myhibernate.client;

import java.util.List;

import com.apex.myhibernate.dao.OrderDAO;
import com.apex.myhibernate.vo.Order;

public class OrderClient {
	public static void main(String[] args) {
		Order order=new Order(2,12,670,"card22","samir","Fremont2");
		OrderDAO orderDAO = new OrderDAO();
		//orderDAO.saveOrder(order);
		//orderDAO.updateOrder(order);
		//orderDAO.deleteOrder(order);
		 List<Order> lst=orderDAO.readOrder();
		 
	}
}