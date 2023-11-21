package com.projectbank.controller;

import com.projectbank.dto.ManagerDto;
import com.projectbank.entity.Manager;
import com.projectbank.mapper.ManagerMapper;
import com.projectbank.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/manager")
@RequiredArgsConstructor
public class ManagerController {

    private final ManagerService managerService;
    private final ManagerMapper managerMapper;

    @GetMapping("/get/{id}")
    public ManagerDto getManager(@PathVariable("id") String id){
        Optional<Manager> opt = managerService.findById(id);

        if (opt.isPresent()){
            return managerMapper.managerToDto(opt.get());
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
