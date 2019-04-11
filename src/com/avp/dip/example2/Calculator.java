package com.avp.dip.example2;

public class Calculator {
    private ICalculatorOperation calculatorOperation;

    public Calculator(ICalculatorOperation calculatorOperation) {
        this.calculatorOperation = calculatorOperation;
    }

    public double solve(double numberOne, double numberTwo) {
        return calculatorOperation.calculate(numberOne, numberTwo);
    }
}
