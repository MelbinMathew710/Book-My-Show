package com.example.BookMyshow.Dtos.RequestDtos;

import com.example.BookMyshow.Enums.Gender;
import lombok.Data;

@Data
public class UserEntryDto {

    private String name;
    private Integer age;
    private String address;
    private String mobileNo;
    private String emailId;
    private Gender gender;
}