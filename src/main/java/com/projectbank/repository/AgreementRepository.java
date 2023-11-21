package com.projectbank.repository;

import com.projectbank.entity.Agreement;
import com.projectbank.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AgreementRepository extends JpaRepository<Product, UUID> {
    Agreement getAgreementByID(UUID id);
}
