package com.example.BookMyshow.Dtos.RequestDtos;

import lombok.Data;

@Data
public class TheaterSeatEntryDto {
    private String address;
    private Integer noOfSeatInRow;
    private Integer noOfPremiumSeat;
    private Integer noOfClassicSeat;
}