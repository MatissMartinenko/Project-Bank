package com.projectbank.service;

import com.projectbank.entity.Agreement;

import java.util.Optional;

public interface AgreementService {
    Optional<Agreement> findById(String id);
}
