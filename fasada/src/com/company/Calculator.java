package com.company;

public class Calculator {
    private double mul(double lh, double rh) {
        return lh * rh;
    }

    private double add(double lh, double rh) {
        return lh + rh;
    }

    private double sub(double lh, double rh) {
        return lh - rh;
    }

    private double div(double lh, double rh) {
        if (rh != 0) {
            return lh / rh;
        }
        throw new ArithmeticException();
    }
    public double calculate(double lh, Ops op, double rh) {
        switch (op) {
            case Add:
                return add(lh, rh);
            case Sub:
                return sub(lh, rh);
            case Mul:
                return mul(lh, rh);
            case Div:
                return div(lh, rh);
        }
        return 0;
    }
}
