package org.example.securingapis2.repository;

import org.example.securingapis2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Define any custom query methods if needed
}

