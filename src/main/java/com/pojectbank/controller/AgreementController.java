package com.pojectbank.controller;

import com.pojectbank.dto.AgreementDto;
import com.pojectbank.entity.Agreement;
import com.pojectbank.mapper.AgreementMapper;
import com.pojectbank.service.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/agreement")
@RequiredArgsConstructor
public class AgreementController {

    private final AgreementService agreementService;
    private final AgreementMapper agreementMapper;

    @GetMapping("/get/{id}")
    public AgreementDto getAgreement(@PathVariable("id") String id){
        Optional<Agreement> opt = agreementService.findById(id);

        if (opt.isPresent()){
            return  agreementMapper.agreementToDto(opt.get());
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
