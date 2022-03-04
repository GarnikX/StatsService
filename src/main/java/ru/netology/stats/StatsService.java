package ru.netology.stats;

public class StatsService {
    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonthlySalesSum(int[] sales) {
        return salesSum(sales)/ sales.length ;
    }

    public int monthMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int monthMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int underAverageMonthlySalesSum(int[] sales) {
        int amount = 0;

        for (int sale : sales) {
            if (sale < averageMonthlySalesSum(sales)) {
                amount++;
            }
        }
        return amount;
    }

    public int upperAverageMonthlySalesSum(int[] sales) {
        int amount = 0;

        for (int sale : sales) {
            if (sale > averageMonthlySalesSum(sales)) {
                amount++;
            }
        }
        return amount;
    }
}
