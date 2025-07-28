package com.registration.user_registration.service;

public class service {


    public interface UserService<UserDto> {
        void register(UserDto userDto);
    }
}
