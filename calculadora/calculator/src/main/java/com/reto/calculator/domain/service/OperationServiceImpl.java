package com.reto.calculator.domain.service;

import com.reto.calculator.domain.repository.OperationRepository;
import com.reto.calculator.persistence.DTO.OperationDTO;
import com.reto.calculator.persistence.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    private OperationRepository operationRepository;



    @Override
    public List<OperationDTO> getAllOperation() {
        List<Operation> operations = operationRepository.findAll();
        return operations.stream()
                .map(Operation::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<OperationDTO> getOperationById(Long id) {

        Optional<Operation> optionalOperation = operationRepository.findById(id);
        return optionalOperation.map(operation -> ResponseEntity.ok(operation.toDTO()))
                .orElse(ResponseEntity.notFound().build());

    }

    @Override
    public ResponseEntity<OperationDTO> saveOperation(OperationDTO operationDTO) {
        Operation operation = Operation.fromDTO(operationDTO);
        operation = operationRepository.save(operation);
        return ResponseEntity.ok(operation.toDTO());

    }

    @Override
    public ResponseEntity<Void> deleteOperation(Long id) {

        if (operationRepository.existsById(id)){
            operationRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
