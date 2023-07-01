package com.example.BookMyshow.Dtos.RequestDtos;

import com.example.BookMyshow.Enums.Genre;
import com.example.BookMyshow.Enums.Language;
import lombok.Data;

import java.sql.Date;

@Data
public class MovieEntryDto {
    private String movieName;
    private Integer duration;
    private Double rating;
    private Date releaseDate;
    private Genre genre;
    private Language language;
}