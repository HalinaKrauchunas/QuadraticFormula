package org.example.buisnessLogicServices;

import org.apache.commons.lang3.math.*;
import org.example.systemServices.*;

public class ValidateService {

    private final PrinterService printerService;

    public boolean isValidateCoefficients(String[] stringCoefficients) {

        for (String stringCoefficient : stringCoefficients) {
            if (!NumberUtils.isParsable(stringCoefficient)) {
                printerService.print("Input string \"" + stringCoefficient + "\" is invalid format");
            } else if (NumberUtils.createDouble(stringCoefficients[0]) == 0.0) {
                printerService.print("Invalid coefficient a. You cannot divide by 0");
            }
            return false;
        }
        return true;
    }

    public ValidateService(PrinterService printerService) {this.printerService = printerService;}
}

