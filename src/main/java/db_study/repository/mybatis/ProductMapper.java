package db_study.repository.mybatis;

import db_study.domain.Product;
import db_study.entity.ProductEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {

    ProductEntity save();

    ProductEntity read();

    Product readProduct();
}
