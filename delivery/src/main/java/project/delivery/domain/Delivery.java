package project.delivery.domain;

import lombok.Getter;
import project.delivery.domain.Order;
import project.delivery.domain.enumType.DeliveryStatus;

import javax.persistence.*;

@Entity
@Getter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    private Order order;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @Embedded
    private Address address;
}
