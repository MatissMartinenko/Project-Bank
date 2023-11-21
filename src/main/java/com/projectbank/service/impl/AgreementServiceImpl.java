package com.projectbank.service.impl;

import com.projectbank.entity.Agreement;
import com.projectbank.repository.AgreementRepository;
import com.projectbank.service.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AgreementServiceImpl implements AgreementService {

    private final AgreementRepository agreementRepository;
    @Override
    public Optional<Agreement> findById(String id) {
        return Optional.empty();
    }
}
