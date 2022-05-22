package project.delivery.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Basket extends TimeBase {

    @Id
    @GeneratedValue
    @Column(name = "basket_id")
    private Long id;

    private Member member;
    private Item item;
}
