package com.example.BookMyshow.Services;

import com.example.BookMyshow.Dtos.RequestDtos.MovieEntryDto;
import com.example.BookMyshow.Exceptions.MovieAlreadyPresentWithSameName;
import com.example.BookMyshow.Models.Movie;
import com.example.BookMyshow.Repositories.MovieRepository;
import com.example.BookMyshow.Transformers.MovieTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto) throws MovieAlreadyPresentWithSameName{
        if(movieRepository.findByName(movieEntryDto.getMovieName()) != null) {
            throw new MovieAlreadyPresentWithSameName();
        }
        Movie movie = MovieTransformer.movieDtoToMovie(movieEntryDto);
        movieRepository.save(movie);
        return "The movie has been added successfully";
    }
}