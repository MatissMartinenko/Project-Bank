package com.pojectbank.service;

import com.pojectbank.entity.Manager;

import java.util.Optional;

public interface ManagerService {
    Optional<Manager> findById(String id);
}
