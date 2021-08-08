package com.gude.api.controller;

import com.gude.api.exception.UserNotFoundException;
import com.gude.api.model.dto.UserDto;
import com.gude.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/{id}")
    public UserDto getUserById(@PathVariable Integer id) throws UserNotFoundException {
        return userService.getUserById(id);
    }

    @GetMapping(value = "/all")
    public List<UserDto> getAllUsersData(){
        return userService.getAllUsersData();
    }

    @PostMapping(value = "")
    public UserDto createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }


}
