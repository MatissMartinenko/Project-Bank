package com.pojectbank.service.impl;

import com.pojectbank.entity.Agreement;
import com.pojectbank.repository.AgreementRepository;
import com.pojectbank.service.AgreementService;
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
