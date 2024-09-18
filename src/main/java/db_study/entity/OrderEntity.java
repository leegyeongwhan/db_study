package db_study.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderEntity {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public OrderEntity() {
    }

    public OrderEntity(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
