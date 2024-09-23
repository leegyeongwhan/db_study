package db_study.repository.mapper;

import db_study.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserMapper {

    void save(UserEntity entity);

    Optional<UserEntity> findById(Long id);

    void update(UserEntity entity);
}
