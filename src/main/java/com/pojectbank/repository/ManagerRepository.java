package com.pojectbank.repository;

import com.pojectbank.entity.Manager;
import com.pojectbank.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ManagerRepository extends JpaRepository<Manager, UUID> {
}
