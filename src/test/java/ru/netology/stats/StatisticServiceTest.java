package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void shouldCalculateSum() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAvg(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinSale(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxSale(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinAverage() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.minAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxAverage() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.maxAverage(purchases);

        assertEquals(expected, actual);
    }
}