package db_study.domain;


import db_study.UserRole;
import db_study.entity.UserEntity;
import db_study.repository.mapper.UserMapper;
import org.assertj.core.api.Assertions;
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
                .userRole(UserRole.GOLD)
                .build();

        userMapper.save(user);
        UserEntity entity = userMapper.findByRole(user.getId(), UserRole.GOLD);
        System.out.println(entity);
    }


    @Test
    void read() {
        UserEntity entity = userMapper.findByRole(1L, UserRole.GOLD);
        UserEntity entity2 = userMapper.findByRole(2L, UserRole.BRONZE);
        System.out.println(entity);
        System.out.println(entity2);
        Assertions.assertThat(entity.getUserRole()).isEqualTo(UserRole.GOLD);
        Assertions.assertThat(entity2.getUserRole()).isEqualTo(UserRole.BRONZE);
    }
}
