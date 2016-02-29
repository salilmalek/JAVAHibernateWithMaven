package com.apex.myhibernate.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "`order`")
public class Order {

	private int order_id;

	private int itemcount;

	private double order_total;

	private String card;

	private String person_name;

	private String shipping_address;

	public Order(int order_id, int itemcount, double order_total, String card,
			String person_name, String shipping_address) {
		super();
		this.order_id = order_id;
		this.itemcount = itemcount;
		this.order_total = order_total;
		this.card = card;
		this.person_name = person_name;
		this.shipping_address = shipping_address;
	}

	public Order() {
	}

	@Id
	@Column(name = "order_id")
	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	@Column(name = "itemcount")
	public int getItemcount() {
		return itemcount;
	}

	public void setItemcount(int itemcount) {
		this.itemcount = itemcount;
	}

	@Column(name = "order_total")
	public double getOrder_total() {
		return order_total;
	}

	public void setOrder_total(double order_total) {
		this.order_total = order_total;
	}

	@Column(name = "card")
	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	@Column(name = "person_name")
	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	@Column(name = "shipping_address")
	public String getShipping_address() {
		return shipping_address;
	}

	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}

	@Override
	public String toString() {
		return "Order_Id: " + this.order_id;
	}

}
