package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long revenue = 0;
        for (long sale : sales) {
            revenue += sale;
        }
        return revenue;
    }

    public long average(long[] sales) {
        long revenue = sum(sales);
        long averageSale = revenue / 12;
        return averageSale;
    }

    public int monthMax(long[] sales) {
        int monthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthNumber]) {
                monthNumber = i;
            }
        }
        return monthNumber + 1;
    }

    public int monthMin(long[] sales) {
        int monthResult = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[monthResult]) {
                monthResult = i;
            }
        }
        return monthResult + 1;
    }

    public int averageBelow(long[] sales) {
        int counter = 0;
        long averageSales = average(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public int averageAbove(long[] sales) {
        int counter = 0;
        long averageSales = average(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

}
