package com.reto.calculator;

import com.reto.calculator.domain.service.OperationService;
import com.reto.calculator.persistence.entity.Operation;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jdk.jfr.Timespan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);
		OperationService operationService = context.getBean(OperationService.class);

		Operation operation = new Operation();
//		double num1 =4;
//		double num2 = 12;
//		double result = num1 + num2;
//		operation.setTime(new Date());
//		operation.setResult(result);
//		operation.setOperationType("Suma");
//		operation.setOperand1(num1);
//		operation.setOperand2(num2);
//
//		operationService.saveOperation(operation);
//		operationService.deleteOperation(2L);
	}

}
