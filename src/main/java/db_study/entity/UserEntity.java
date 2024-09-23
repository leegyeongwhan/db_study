package db_study.entity;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserEntity {
    private Long id;
    private String name;
    private Long stock;


    @Builder
    public UserEntity(Long id, String name, Long stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }
}
