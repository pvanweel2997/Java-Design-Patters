package com.bharath.patterns.movietickets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bharath.patterns.movietickets.dao.TicketDAO;
import com.bharath.patterns.movietickets.bo.Ticket;
import com.bharath.patterns.movietickets.services.TicketService;

@Controller
public class TicketController {
	
	@Autowired
	private TicketService service;
	
	@GetMapping("/showCreateTicket")
	public String showCreateTicket() {
		return "createTicket";
	}
	
	@PostMapping("/createTicket")
	public String createTicket(Ticket ticket, ModelMap modelMap) {
		service.purchaseTicket(ticket);
		modelMap.addAttribute("msg","Ticket Purchased Successfully");
		return "createTicket";
	}
}
