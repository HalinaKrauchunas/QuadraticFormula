package org.example;

import org.example.buisnessLogicServices.*;
import org.example.systemServices.*;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class ValidateServiceTest {

    @Test
    public void coefficientAIsZero() {

        ValidateService validateService = new ValidateService(new SystemConsolePrinter());
        boolean result = validateService.isValidateCoefficients(new String[]{"0", "8", "14"});
        assertFalse(result);
    }

    @Test
    public void allCoefficientsAreZero() {

        ValidateService validateService = new ValidateService(new SystemConsolePrinter());
        boolean result = validateService.isValidateCoefficients(new String[]{"0", "0", "0"});
        assertFalse(result);
    }
}
