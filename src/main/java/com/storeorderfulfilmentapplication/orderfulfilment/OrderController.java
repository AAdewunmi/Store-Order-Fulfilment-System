package com.storeorderfulfilmentapplication.orderfulfilment;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	private final OrderRepository orderRepository;
	private final OrderModelAssembler assembler;

}