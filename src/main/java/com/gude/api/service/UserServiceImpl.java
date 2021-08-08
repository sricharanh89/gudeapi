package com.gude.api.service;

import com.gude.api.exception.UserNotFoundException;
import com.gude.api.model.data.User;
import com.gude.api.model.dto.UserDto;
import com.gude.api.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto getUserById(Integer id) throws UserNotFoundException {
        ModelMapper modelMapper = new ModelMapper();
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()) {
            throw new UserNotFoundException();
        }

        return modelMapper.map(user.get(), UserDto.class);
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userDto, User.class);
        user = userRepository.save(user);
        return modelMapper.map(user, UserDto.class);
    }
}
