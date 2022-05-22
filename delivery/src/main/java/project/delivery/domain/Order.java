package project.delivery.domain;

import lombok.Getter;
import project.delivery.domain.enumType.OrderStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    private Member member;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
