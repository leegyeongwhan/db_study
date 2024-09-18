package db_study.repository.mybatis;

import db_study.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface OrderMapper {

    void save(OrderEntity orderEntity);

    Optional<OrderEntity> findById(Long id);
}
