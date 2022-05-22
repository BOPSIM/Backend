package project.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.delivery.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
