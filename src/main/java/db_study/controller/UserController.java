package db_study.controller;

import db_study.entity.UserEntity;
import db_study.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserEntity save(@RequestBody UserSaveRequest request) {
        return userService.save(request);
    }
}
