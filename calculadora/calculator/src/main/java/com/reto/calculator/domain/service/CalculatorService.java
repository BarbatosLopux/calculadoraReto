package com.reto.calculator.domain.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double suma(double num1,double num2){
        return (num1+num2);
    }

    public double resta(double num1, double num2){
        return (num1-num2);
    }

    public double multiplicacion(double num1, double num2){
        return (num1*num2);
    }

    public  double division(double num1,double num2){
        return (num1/num2);
    }


}
