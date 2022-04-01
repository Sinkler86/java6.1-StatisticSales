package ru.netology.stats;

public class StatisticService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale; //можно записать sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMinSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findMaxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minAverage(int[] sales) {
        int average = calculateSum(sales) / sales.length;
        int avgCount = 0;
        for (long sale : sales) {
            if (sale < average) {
                avgCount = avgCount + 1;
            }
        }
        return avgCount;
    }

    public int maxAverage(int[] sales) {
        int average = calculateSum(sales) / sales.length;
        int avgCount = 0;
        for (long sale : sales) {
            if (sale > average) {
                avgCount = avgCount + 1;
            }
        }
        return avgCount;
    }
}

