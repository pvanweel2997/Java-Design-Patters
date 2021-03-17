package com.bharath.patterns.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.patterns.movietickets.dao.TicketDAO;
import com.bharath.patterns.movietickets.bo.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketDAO dao;

	@Override
	public void purchaseTicket(Ticket ticketBO) {
		// process payment code would go here
		
		com.bharath.patterns.movietickets.model.Ticket ticketModel = new com.bharath.patterns.movietickets.model.Ticket();
		ticketModel.setId(ticketBO.getId());
		ticketModel.setMovie(ticketBO.getMovieName());
		ticketModel.setScreen(ticketBO.getScreenNo());
		ticketModel.setSeat(ticketBO.getSeatNo());
		dao.createTicket(ticketModel);
		// email or tet ticket
	}

}
