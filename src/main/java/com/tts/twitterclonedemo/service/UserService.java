package com.tts.twitterclonedemo.service;

import com.tts.twitterclonedemo.model.User;
import com.tts.twitterclonedemo.repository.RoleRepository;
import com.tts.twitterclonedemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

public interface UserService {

    User findByUsername(String username);
    List<User> findAll();
    void save(User user);
    User saveNewUser(User user);
    User getLoggedInUser();



}
