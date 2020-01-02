package com.spring.cloud.client.dao;

import com.spring.cloud.client.dto.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestDAO extends CrudRepository<UserDetails, Integer> {

    @Override
    Iterable<UserDetails> findAll();

    @Override
    Optional<UserDetails> findById(Integer aLong);

    UserDetails findByfName(String firstName);
}
