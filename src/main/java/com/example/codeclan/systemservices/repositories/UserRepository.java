package com.example.codeclan.systemservices.repositories;

import com.example.codeclan.systemservices.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
