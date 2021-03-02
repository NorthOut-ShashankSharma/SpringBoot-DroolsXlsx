package com.northout.springboot.drools.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.northout.springboot.drools.model.Order;

@RestController
public class MegaOfferController {

	@Autowired
	private KieSession session;

	@PostMapping("/order")
	public Order orderNow(@RequestBody Order order) {
		session.insert(order);
		session.fireAllRules();
		return order;
	}

}
