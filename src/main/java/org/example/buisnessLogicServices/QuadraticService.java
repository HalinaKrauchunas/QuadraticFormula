package org.example.buisnessLogicServices;

import org.apache.commons.lang3.math.*;

public class QuadraticService {

    public Double[] stringCoefficientsToDouble(String[] coefficients) {

        Double[] doubleCoefficients = new Double[3];
        for (int i = 0; i < coefficients.length; i++) {
            doubleCoefficients[i] = NumberUtils.createDouble(coefficients[i]);
        }
        return doubleCoefficients;
    }

    public Double[] returnArrayWithRoots(Double[] doubleCoefficients) {

        double a = doubleCoefficients[0];
        double b = doubleCoefficients[1];
        double c = doubleCoefficients[2];

        double discriminant = b * b - (4 * a * c);

        Double[] roots;
        if (discriminant > 0) {
            roots = new Double[]{
                (-b + Math.sqrt(discriminant)) / (2 * a),
                (-b - Math.sqrt(discriminant)) / (2 * a)};
        } else if (discriminant == 0) {
            roots = new Double[]{-b / (2 * a)};
        } else {
            roots = new Double[0];
        }
        return roots;
    }
}
