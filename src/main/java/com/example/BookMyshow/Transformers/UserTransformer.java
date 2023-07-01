package com.example.BookMyshow.Transformers;

import com.example.BookMyshow.Dtos.RequestDtos.UserEntryDto;
import com.example.BookMyshow.Dtos.ResponseDtos.ReturnUserDto;
import com.example.BookMyshow.Models.User;

public class UserTransformer {

    public static User userDtoToUser(UserEntryDto userEntryDto) {
        User user = User.builder()
                .name(userEntryDto.getName())
                .age(userEntryDto.getAge())
                .address(userEntryDto.getAddress())
                .gender(userEntryDto.getGender())
                .mobileNo(userEntryDto.getMobileNo())
                .emailId(userEntryDto.getEmailId())
                .build();

        return user;
    }

    public static ReturnUserDto userToUserDto(User user) {
        ReturnUserDto userDto = ReturnUserDto.builder()
                .name(user.getName())
                .age(user.getAge())
                .address(user.getAddress())
                .gender(user.getGender())
                .build();

        return userDto;
    }
}