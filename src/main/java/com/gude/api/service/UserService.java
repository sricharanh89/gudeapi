package com.gude.api.service;

import com.gude.api.exception.UserNotFoundException;
import com.gude.api.model.dto.UserDto;

public interface UserService {
    UserDto getUserById(Integer id) throws UserNotFoundException;
    UserDto createUser(UserDto userDto);
}
