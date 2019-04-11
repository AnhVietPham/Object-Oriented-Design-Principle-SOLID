package com.avp.dip.example2;

import com.avp.dip.example2.operation.AddCalculatorOperation;
import com.avp.dip.example2.operation.DivideCalculatorOperation;
import com.avp.dip.example2.operation.MultiplyCalculatorOperation;
import com.avp.dip.example2.operation.SubtractCalculatorOperation;

public class CalculatorProgram {
    public static void main(String args[]) {
        Calculator addCalculator = new Calculator(new AddCalculatorOperation());
        System.out.println("Add calculator: " + addCalculator.solve(1, 2));

        Calculator subCalculator = new Calculator(new SubtractCalculatorOperation());
        System.out.println("Subtract calculator: " + subCalculator.solve(3, 5));

        Calculator mulCalculator = new Calculator(new MultiplyCalculatorOperation());
        System.out.println("Multiply calculator: " + mulCalculator.solve(4, 6));

        Calculator divideCalculator = new Calculator(new DivideCalculatorOperation());
        System.out.println("Divide calculator: " + divideCalculator.solve(5, 6));
    }
}
