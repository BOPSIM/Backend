package project.delivery.domain;

import lombok.Getter;
import project.delivery.domain.enumType.Authority;
import project.delivery.domain.enumType.ProviderType;
import project.delivery.domain.enumType.Rank;

import javax.persistence.*;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String email;
    private String password;
    private String phoneNumber;
    private String nickname;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private ProviderType type;
    @Enumerated(EnumType.STRING)
    private Authority authority;

    private String imgName;
    private String imgUrl;

    @Enumerated(EnumType.STRING)
    private Rank rank;
}
