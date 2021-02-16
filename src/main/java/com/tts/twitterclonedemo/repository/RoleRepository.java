package com.tts.twitterclonedemo.repository;

import com.tts.twitterclonedemo.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    com.tts.twitterclonedemo.model.Role findByRole(String role);
}
