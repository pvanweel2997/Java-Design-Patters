package com.bharath.patterns.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bharath.patterns.movietickets.model.Ticket;

@Repository
public class TicketDAOImpl implements TicketDAO {
	
	private static final String sql = "insert into mydb.ticket (movie, screen, seat) values(?,?,?)";
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void createTicket(Ticket ticket) {
		jdbcTemplate.update(sql, ticket.getMovie(),ticket.getScreen(),ticket.getSeat());
	}
}
;