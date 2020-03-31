package com.example.codeclan.systemservices.repositories;

import com.example.codeclan.systemservices.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
