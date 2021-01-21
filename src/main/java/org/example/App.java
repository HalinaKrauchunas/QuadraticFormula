package org.example;

import org.example.buisnessLogicServices.*;
import org.example.objects.*;
import org.example.systemServices.*;

import java.util.*;

public class App {

    public static void main(String[] args) {

        PrinterService printer = new SystemConsolePrinter();
        SystemConsoleUserInputService userInputService = new SystemConsoleUserInputService();

        CoefficientsInputService coefficientsInputService = new CoefficientsInputService(printer, userInputService);
        ValidateService validateService = new ValidateService(printer);
        QuadraticService quadraticService = new QuadraticService();

        String[] stringCoefficients;
        boolean isValidate;
        do {
            stringCoefficients = coefficientsInputService.askUserToInputCoefficients();
            isValidate = validateService.isValidateCoefficients(stringCoefficients);
        }
        while (!isValidate);

        Double[] doubleCoefficients = quadraticService.stringCoefficientsToDouble(stringCoefficients);

        QuadraticEquation quadraticEquation = new QuadraticEquation(doubleCoefficients);
        printer.print(quadraticEquation.toString());

        Double[] roots = quadraticService.returnArrayWithRoots(doubleCoefficients);
        printer.print("Your roots: " + Arrays.toString(roots));
    }
}
