package com.example.demo.controller;

import com.example.demo.dao.entity.AppUser;
import com.example.demo.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
@Tag(name = "Пользователи", description = "Контроллер для работы с пользователями")
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody AppUser appUser) {
        return ResponseEntity.ok().body(userService.saveUser(appUser));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }
}
