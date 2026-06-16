package com.vaccine.vms.service.impl;

import com.vaccine.vms.dto.UserDto;
import com.vaccine.vms.entity.User;
import com.vaccine.vms.exception.ResourceNotFoundException;
import com.vaccine.vms.mapper.UserMapper;
import com.vaccine.vms.repository.UserRepository;
import com.vaccine.vms.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User is not existing with the given id: "  + userId));
        return null;
    }

}
