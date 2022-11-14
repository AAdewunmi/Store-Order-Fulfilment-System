package com.storeorderfulfilmentapplication.orderfulfilment;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class OrderModelAssembler implements RepresentationModelAssembler<Order, EntityModel<Order>>{

	@Override
	public EntityModel<Order> toModel(Order order) {
		EntityModel<Order> orderModel = EntityModel.of(order,
				linkTo(methodOn(OrderController.class).one(order.getId())).withSelfRel(),
				linkTo(methodOn(OrderController.class).all()).withRel("Orders"));
		
		if (order.getStatus() == Status.IN_PROGRESS) {
			orderModel.add(linkTo(methodOn(OrderController.class).cancel(order.getId())).withRel("Cancel"));
			orderModel.add(linkTo(methodOn(OrderController.class).complete(order.getId())).withRel("Complete"));
		}
		return orderModel;
	}

}
