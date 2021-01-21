package org.example.objects;

public class QuadraticEquation {

    private final Double[] doubleCoefficients;

    @Override
    public String toString() {

        double a = doubleCoefficients[0];
        double b = doubleCoefficients[1];
        double c = doubleCoefficients[2];

        if (b < 0 && c < 0) {
            return "Quadratic equation: " +
                a + "x²" + " - " + Math.abs(b) + "x" + " - " + Math.abs(c) + " = 0";
        }
        if (b < 0) {
            return "Quadratic equation: " +
                a + "x²" + " - " + Math.abs(b) + "x" + " + " + c + " = 0";
        }
        if (c < 0) {
            return "Quadratic equation: " +
                a + "x²" + " + " + b + "x" + " - " + Math.abs(c) + " = 0";
        } else {
            return "Quadratic equation: " +
                a + "x²" + " + " + b + "x" + " + " + c + "= 0";
        }
    }

    public QuadraticEquation(Double[] doubleCoefficients) {

        this.doubleCoefficients = doubleCoefficients;
    }
}
