package com.storeorderfulfilmentapplication.orderfulfilment;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	private final OrderRepository orderRepository;
	private final OrderModelAssembler assembler;
	
	public OrderController(OrderRepository orderRepository, OrderModelAssembler assembler) {
		this.orderRepository = orderRepository;
		this.assembler = assembler;
	}
	
	

}
