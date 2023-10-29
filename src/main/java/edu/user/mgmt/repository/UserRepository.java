package edu.user.mgmt.repository;

import edu.user.mgmt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findByUserId(long userId);
}
