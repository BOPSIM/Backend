package project.delivery.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String zipcode;
    private String mainAddress;
    private String subAddress;
}
