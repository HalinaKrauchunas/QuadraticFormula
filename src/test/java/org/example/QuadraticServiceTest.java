package org.example;

import org.example.buisnessLogicServices.*;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.*;
import java.util.stream.*;

import static org.junit.Assert.*;

public class QuadraticServiceTest {

    @Test
    public void twoExistingRoots() {

        QuadraticService quadraticService = new QuadraticService();
        Double[] arrayRoots = quadraticService.returnArrayWithRoots(new Double[]{1.0, -2.0, -3.0});
        assertArrayEquals(Arrays.asList(3.0, -1.0).toArray(), arrayRoots);
    }

    @Test
    public void oneExitingRoot() {

        QuadraticService quadraticService = new QuadraticService();
        Double[] arrayRoots = quadraticService.returnArrayWithRoots(new Double[]{1.0, -6.0, 9.0});
        assertArrayEquals(Collections.singletonList(3.0).toArray(), arrayRoots);
    }

    @Test
    public void noRoots() {

        QuadraticService quadraticService = new QuadraticService();
        Double[] arrayRoots = quadraticService.returnArrayWithRoots(new Double[]{5.0, 3.0, 7.0});
        assertArrayEquals(Collections.emptyList().toArray(), arrayRoots);
    }

    @ParameterizedTest
    @MethodSource("coefficientsAtBEqualToZero")
    void coefficientBIsZero(double a, double b, double c, Double[] result) {

        QuadraticService quadraticService = new QuadraticService();
        Double[] arrayRoots = quadraticService.returnArrayWithRoots(new Double[]{a, b, c});
        Assertions.assertArrayEquals(result, arrayRoots);
    }

    private static Stream<Arguments> coefficientsAtBEqualToZero() {

        return Stream.of(
            Arguments.of(2, 0, 7, new Double[0]),
            Arguments.of(-11, 0, -3, new Double[0]),
            Arguments.of(-8, 0, 2, new Double[]{-0.5, 0.5}),
            Arguments.of(6, 0, -28, new Double[]{2.160246899469287, -2.160246899469287}));
    }

    @ParameterizedTest
    @MethodSource("coefficientsAtCEqualToZero")
    void coefficientCIsZero(double a, double b, double c, Double[] result) {

        QuadraticService quadraticService = new QuadraticService();
        Double[] arrayRoots = quadraticService.returnArrayWithRoots(new Double[]{a, b, c});
        Assertions.assertArrayEquals(result, arrayRoots);
    }

    private static Stream<Arguments> coefficientsAtCEqualToZero() {

        return Stream.of(
            Arguments.of(2, 7, 0, new Double[]{0.0, -3.5}),
            Arguments.of(-8, -6, 0, new Double[]{-0.75, -0.0}),
            Arguments.of(2, -6, 0, new Double[]{3.0, 0.0}),
            Arguments.of(-9, 4, 0, new Double[]{-0.0, 0.4444444444444444}));
    }

    @ParameterizedTest
    @MethodSource("coefficientsAtBAndCEqualToZero")
    void coefficientsBAndCAreZero(double a, double b, double c, Double[] result) {

        QuadraticService quadraticService = new QuadraticService();
        Double[] arrayRoots = quadraticService.returnArrayWithRoots(new Double[]{a, b, c});
        Assertions.assertArrayEquals(result, arrayRoots);
    }

    private static Stream<Arguments> coefficientsAtBAndCEqualToZero() {

        return Stream.of(
            Arguments.of(2, 0, 0, new Double[]{-0.0}),
            Arguments.of(-11, 0, 0, new Double[]{0.0}));
    }
}
