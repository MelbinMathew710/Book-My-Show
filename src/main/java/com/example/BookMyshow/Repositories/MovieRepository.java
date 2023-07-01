package com.example.BookMyshow.Repositories;

import com.example.BookMyshow.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie findByName(String name);
}