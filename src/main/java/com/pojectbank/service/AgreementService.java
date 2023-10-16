package com.pojectbank.service;

import com.pojectbank.entity.Agreement;

import java.util.Optional;

public interface AgreementService {
    Optional<Agreement> findById(String id);
}
