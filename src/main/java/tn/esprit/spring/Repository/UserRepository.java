package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

}
