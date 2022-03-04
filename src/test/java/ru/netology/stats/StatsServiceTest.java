package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void salesSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.salesSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageMonthlySalesSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageMonthlySalesSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.monthMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.monthMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void underAverageMonthlySalesSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.underAverageMonthlySalesSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void upperAverageMonthlySalesSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.upperAverageMonthlySalesSum(sales);
        assertEquals(expected, actual);
    }
}