package com.example.BookMyshow.Dtos.RequestDtos;

import lombok.Data;

@Data
public class ShowSeatEntryDto {
    private Integer theaterId;
    private Integer priceOfPremiumSeat;
    private Integer priceOfClassicSeat;
}