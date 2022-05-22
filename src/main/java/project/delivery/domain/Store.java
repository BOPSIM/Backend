package project.delivery.domain;

import lombok.Getter;
import project.delivery.domain.enumType.Category;

import javax.persistence.*;

@Entity
@Getter
public class Store extends TimeBase {

    @Id
    @GeneratedValue
    @Column(name = "store_id")
    private Long id;

    private String storeName;
    private String introduce;

    @Embedded
    private Address address;

    private int minOrder;
    @Embedded
    private Category category;

    private float rating;
    private String callNumber;
}
