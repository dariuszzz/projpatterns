package com.company;

public class Main {

    public static void main(String[] args) {
	    Calculator calc = new Calculator();

        System.out.println(calc.calculate(2, Ops.Add, 4));
        System.out.println(calc.calculate(2, Ops.Mul, 4));
        System.out.println(calc.calculate(2, Ops.Div, 4));
        System.out.println(calc.calculate(2, Ops.Sub, 4));
    }
}
