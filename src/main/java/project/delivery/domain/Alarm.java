package project.delivery.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Alarm {

    @Id
    @GeneratedValue
    @Column(name = "alarm_id")
    private Long id;

    private String content;
}
