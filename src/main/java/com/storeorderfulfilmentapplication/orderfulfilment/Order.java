package com.storeorderfulfilmentapplication.orderfulfilment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {
	
	private @Id @GeneratedValue Long id;
	private String description;
	private Status status;
	
	public Order() {}

	public Order(String description, Status status) {
		this.description = description;
		this.status = status;
	}
	
	

}
