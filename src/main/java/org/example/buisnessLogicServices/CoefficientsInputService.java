package org.example.buisnessLogicServices;

import org.example.systemServices.*;

public class CoefficientsInputService {

    private final PrinterService printer;
    private final SystemConsoleUserInputService userInputService;

    public String[] askUserToInputCoefficients() {

        String[] stringsCoefficients = new String[3];

        printer.print("Please, enter the coefficients for the quadratic equation: ax²+ bx + c = 0");

        printer.print("Please enter the coefficient a: ");
        stringsCoefficients[0] = userInputService.readInput();
        printer.print("Please enter the coefficient b: ");
        stringsCoefficients[1] = userInputService.readInput();
        printer.print("Please enter the coefficient c: ");
        stringsCoefficients[2] = userInputService.readInput();

        return stringsCoefficients;
    }

    public CoefficientsInputService(PrinterService printer, SystemConsoleUserInputService userInputService) {

        this.printer = printer;
        this.userInputService = userInputService;
    }
}
