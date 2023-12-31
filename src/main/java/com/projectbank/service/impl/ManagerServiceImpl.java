package com.projectbank.service.impl;

import com.projectbank.entity.Manager;
import com.projectbank.repository.ManagerRepository;
import com.projectbank.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {

    public final ManagerRepository managerRepository;


    @Override
    public Optional<Manager> findById(String id) {
        return managerRepository.findById(UUID.fromString(id));
    }
}
