package com.gude.api.service;

import com.gude.api.exception.UserNotFoundException;
import com.gude.api.model.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getUserById(Integer id) throws UserNotFoundException;
    UserDto createUser(UserDto userDto);
    List<UserDto> getAllUsersData();
}
