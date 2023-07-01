package com.example.BookMyshow.Repositories;

import com.example.BookMyshow.Models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show, Integer> {
}