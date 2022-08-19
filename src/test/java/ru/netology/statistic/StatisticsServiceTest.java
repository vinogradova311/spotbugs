package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxIf() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {9, 11, 10, 9, 24, 7, 6, 8, 17, 3, 2, 6};
        long expected = 24;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}

