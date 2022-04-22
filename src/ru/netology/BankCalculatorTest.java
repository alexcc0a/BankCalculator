package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankCalculatorTest {
    private final int sum = 2_000_000;
    private final double rate = 21;
    private final int period = 84;

    BankCalculator calculator = new BankCalculator();

    @Test
    void testSumPerMonth() {
        int expected = 37_480;
        int actual = calculator.sumPerMonth(sum, rate, period);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testFullSumReturn() {
        int expected = 3_148_321;
        int actual = calculator.fullSumReturn(sum, rate, period);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverPaySum() {
        int expected = 1_148_321;
        int actual = calculator.overPaySum(sum, rate, period);
        Assertions.assertEquals(expected, actual);
    }
}