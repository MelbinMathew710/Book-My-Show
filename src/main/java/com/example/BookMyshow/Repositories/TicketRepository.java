package com.example.BookMyshow.Repositories;

import com.example.BookMyshow.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}