package com.vaccine.vms.service;

import com.vaccine.vms.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);
}
