package db_study.domain;


import db_study.entity.UserEntity;
import db_study.repository.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void create() {
        UserEntity user = UserEntity.builder()
                .stock(null)
                .name("111")
                .build();

        userMapper.save(user);
        UserEntity entity = userMapper.findById(user.getId()).get();
        System.out.println(entity);
    }

}
