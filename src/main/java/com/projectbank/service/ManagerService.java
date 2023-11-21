package com.projectbank.service;

import com.projectbank.entity.Manager;

import java.util.Optional;

public interface ManagerService {
    Optional<Manager> findById(String id);
}
