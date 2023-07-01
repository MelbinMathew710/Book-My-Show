package com.example.BookMyshow.Transformers;

import com.example.BookMyshow.Dtos.RequestDtos.TheaterEntryDto;
import com.example.BookMyshow.Models.Theater;

public class TheaterTransformer {

    public static Theater theaterDtoToTheater(TheaterEntryDto entryDto) {
        Theater theater = Theater.builder()
                .name(entryDto.getName())
                .address(entryDto.getAddress())
                .build();
        return theater;
    }
}