package com.gude.api.repository;

import com.gude.api.model.data.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {

    @Override
    Optional<User> findById(Integer integer);
}
