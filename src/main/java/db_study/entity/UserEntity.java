package db_study.entity;

import db_study.UserRole;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserEntity {
    private Long id;
    private String name;
    private Long stock;
    private UserRole userRole;

    @Builder
    public UserEntity(Long id, String name, Long stock, UserRole userRole) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.userRole = userRole;
    }
}
