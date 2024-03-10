package com.reto.calculator.persistence.entity;

import com.reto.calculator.persistence.DTO.OperationDTO;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "operation")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "operation_type")
    private String operationType;

    @Column(name = "operand_one")
    private double operand1;
    @Column(name = "operation_two")
    private double operand2;
    @Column(name = "result")
    private double result;

    @Temporal(TemporalType.DATE)
    @Column(name = "timestamp")
    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public OperationDTO toDTO() {
        OperationDTO dto = new OperationDTO();
        dto.setId(this.id);
        dto.setOperationType(this.operationType);
        dto.setOperand1(this.operand1);
        dto.setOperand2(this.operand2);
        dto.setResult(this.result);
        dto.setTime(this.time);

        return dto;
    }

    public static Operation fromDTO(OperationDTO dto) {
        Operation operation = new Operation();
        operation.setId(dto.getId());
        operation.setOperand1(dto.getOperand1());
        operation.setOperand2(dto.getOperand2());
        operation.setResult(dto.getResult());
        operation.setOperationType(dto.getOperationType());
        operation.setTime(dto.getTime());

        return operation;
    }
    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", operationType='" + operationType + '\'' +
                ", operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", result=" + result +
                ", time=" + time +
                '}';
    }
}
