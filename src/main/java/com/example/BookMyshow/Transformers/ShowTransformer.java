package com.example.BookMyshow.Transformers;

import com.example.BookMyshow.Dtos.RequestDtos.ShowEntryDto;
import com.example.BookMyshow.Models.Show;

public class ShowTransformer {

    public static Show showDtoToShow(ShowEntryDto showEntryDto) {
        Show show = Show.builder()
                .time(showEntryDto.getShowStartTime())
                .date(showEntryDto.getShowDate())
                .build();

        return show;
    }
}