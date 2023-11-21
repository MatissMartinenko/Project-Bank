package com.projectbank.repository;

import com.projectbank.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ManagerRepository extends JpaRepository<Manager, UUID> {
    Manager getManagersById(UUID id);
}
