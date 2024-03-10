package com.reto.calculator.domain.service;

import com.reto.calculator.domain.repository.OperationRepository;
import com.reto.calculator.persistence.DTO.OperationDTO;
import com.reto.calculator.persistence.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OperationService {


    List<OperationDTO> getAllOperation();
    ResponseEntity<OperationDTO> getOperationById(Long id);
    ResponseEntity<OperationDTO> saveOperation(OperationDTO operationDTO);
    ResponseEntity<Void> deleteOperation(Long id);

//    @Autowired
//    private OperationRepository operationRepository;
//
//
//    public List<Operation> getAll() {
//
//        return operationRepository.findAll();
//    }
//
//    public Operation getById(Long id ){
//
//        return operationRepository.findById(id).orElse(null);
//    }
//
//    public Operation saveOperation(Operation operation) {
//
//        return operationRepository.save(operation);
//    }
//
//    public void deleteOperation(Long id) {
//
//        operationRepository.deleteById(id);
//    }
//
//    public void updateOperation(Long id, Operation operation){
//        Operation operationNew = operationRepository.findById(id).orElse(null);
//
//        operationNew.setOperationType(operation.getOperationType());
//        operationNew.setOperand1(operation.getOperand1());
//        operationNew.setOperand2(operation.getOperand2());
//        operationNew.setResult(operation.getResult());
//        operationNew.setTime(operation.getTime());
//
//        operationRepository.save(operationNew);
//    }

}
