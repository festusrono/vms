package com.vaccine.vms.controller;

import com.vaccine.vms.dto.UserDto;
import com.vaccine.vms.service.UserService;
import lombok.AllArgsConstructor;
import org.hibernate.mapping.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    //build add USER REST API
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto savedUser =  userService.createUser(userDto);
        return new ResponseEntity<>(savedUser,HttpStatus.CREATED);
    }
    //build GET user Rest api
    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId) {
        UserDto userDto = userService.getUserById(userId);
        return ResponseEntity.ok(userDto);
    }
}
