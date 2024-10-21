package db_study.service;

import db_study.UserRole;
import db_study.controller.UserSaveRequest;
import db_study.entity.UserEntity;
import db_study.repository.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;


    public UserEntity save(UserSaveRequest request) {
        UserEntity user = UserEntity.builder()
                .stock(request.stock())
                .name(request.name())
                .build();

        userMapper.save(user);

        return userMapper.findById(user.getId()).get();
    }

    public void update(UserSaveRequest request) {
        UserEntity user = UserEntity.builder()
                .stock(request.stock())
                .name(request.name())
                .build();

        userMapper.update(user);

    }

    public UserEntity read(Long id) {
        return userMapper.findById(id).get();
    }

    public UserEntity readUserByRole(Long id, UserRole userRole) {
        return userMapper.findByRole(id, userRole);
    }
}
