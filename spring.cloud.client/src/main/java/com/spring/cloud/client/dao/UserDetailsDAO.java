package com.spring.cloud.client.dao;

import com.spring.cloud.client.dto.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "users", rel = "userDetails")

public interface UserDetailsDAO extends CrudRepository<UserDetails, Integer> {

}
