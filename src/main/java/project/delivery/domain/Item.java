package project.delivery.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Item extends TimeBase{

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private Store store;

    private String name;
    private int price;
    private int quantity;
    private String imgName;
    private String imgUrl;
    private int good;
}
