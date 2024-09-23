package db_study.domain;

import db_study.controller.UserSaveRequest;
import db_study.entity.UserEntity;
import db_study.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void create() {
        UserEntity save = userService.save(new UserSaveRequest(null, "test", "test"));
        System.out.println(save);

        userService.update(new UserSaveRequest(1L, "test", "test"));

        UserEntity read = userService.read(save.getId());
        System.out.println(read);
    }
}
