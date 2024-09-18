package db_study.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("Product")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    private Long id;
    private String num;
    private String o1;
    private String name;
    private String orderNum;
    private String p1;
}
