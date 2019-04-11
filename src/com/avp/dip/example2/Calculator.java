package com.avp.dip.example2;

class Calculator {
    private ICalculatorOperation calculatorOperation;

    Calculator(ICalculatorOperation calculatorOperation) {
        this.calculatorOperation = calculatorOperation;
    }

    double solve(double numberOne, double numberTwo) {
        return calculatorOperation.calculate(numberOne, numberTwo);
    }
}
