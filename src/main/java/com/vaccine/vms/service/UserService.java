package com.vaccine.vms.service;

import com.vaccine.vms.dto.UserDto;
//import org.hibernate.mapping.List;
import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();
    UserDto updateUser(Long userId, UserDto userDto);

    void deleteUser(Long userId);

}
