package com.registration.user_registration.service;

import com.registration.user_registration.Repository.UserRepository;
import com.registration.user_registration.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



    @Service
    public class service extends UserService {

        @Autowired
        private UserRepository userRepository;
        @Autowired private PasswordEncoder passwordEncoder;

        @Override
        public void register(userDto userDto) {
            if (userRepository.existsByEmail(userDto.getEmail())) {
                throw new RuntimeException("Email already exists");
            }

            User user = new User();
            user.setName(userDto.getName());
            user.setEmail(userDto.getEmail());
            user.setPassword(passwordEncoder.encode(userDto.getPassword()));
            userRepository.save(user);
        }
    }


