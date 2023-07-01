package com.example.BookMyshow.Services;

import com.example.BookMyshow.Dtos.RequestDtos.UserEntryDto;
import com.example.BookMyshow.Exceptions.UserAlreadyExistsWithEmail;
import com.example.BookMyshow.Models.User;
import com.example.BookMyshow.Repositories.UserRepository;
import com.example.BookMyshow.Transformers.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto) throws UserAlreadyExistsWithEmail{
        if(userRepository.findByEmailId(userEntryDto.getEmailId()) != null) {
            throw new UserAlreadyExistsWithEmail();
        }
        User user = UserTransformer.userDtoToUser(userEntryDto);

        userRepository.save(user);
        return "User Saved Successfully";
    }
}