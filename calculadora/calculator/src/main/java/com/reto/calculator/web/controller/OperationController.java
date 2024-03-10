package com.reto.calculator.web.controller;

import com.reto.calculator.domain.service.OperationServiceImpl;
import com.reto.calculator.persistence.DTO.OperationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/operation")
public class OperationController {

    private final OperationServiceImpl operationService;
    @Autowired
    public OperationController(OperationServiceImpl operationService) {
        this.operationService = operationService;
    }

    @GetMapping()
    public List<OperationDTO> getAll() {

        return operationService.getAllOperation();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OperationDTO> getById(@PathVariable Long id) {

        return operationService.getOperationById(id);
    }
}
