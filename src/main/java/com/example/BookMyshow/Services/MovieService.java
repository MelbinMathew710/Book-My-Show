package com.example.BookMyshow.Services;

import com.example.BookMyshow.Dtos.RequestDtos.MovieEntryDto;
import com.example.BookMyshow.Exceptions.MovieAlreadyPresentWithSameNameAndLanguage;
import com.example.BookMyshow.Models.Movie;
import com.example.BookMyshow.Repositories.MovieRepository;
import com.example.BookMyshow.Transformers.MovieTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto) throws MovieAlreadyPresentWithSameNameAndLanguage {
        if(movieRepository.findByMovieName(movieEntryDto.getMovieName()) != null) {
            if(movieRepository.findByMovieName(movieEntryDto.getMovieName()).getLanguage().equals(movieEntryDto.getLanguage())){
                throw new MovieAlreadyPresentWithSameNameAndLanguage();
            }
        }
        Movie movie = MovieTransformer.movieDtoToMovie(movieEntryDto);
        movieRepository.save(movie);
        return "The movie has been added successfully";
    }
}