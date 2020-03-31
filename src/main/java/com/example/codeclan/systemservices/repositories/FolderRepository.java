package com.example.codeclan.systemservices.repositories;

import com.example.codeclan.systemservices.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
