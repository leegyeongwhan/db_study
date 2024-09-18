package db_study.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
    private Long id;
    private String name;
    private String num;
    private String p1;

    @Builder
    public ProductEntity(String name, String num) {
        this.name = name;
        this.num = num;
    }
}
