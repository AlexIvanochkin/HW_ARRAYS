package ru.netology.javaqa;

public class StatisticService {

    public long allSalesSum(long[] arr) {
        long sum = 0;
        for (long el : arr) {
            sum += el;
        }
        return sum;
    }

    public long averageAllSalesSum(long[] arr) {return allSalesSum(arr) / (arr.length);}

    public int maxSalesMonth(long[] arr) {
        int maxSalesMonth = 1;
        long max = arr[0];
        for (int month = 0; month <= arr.length - 1; month++) {
            if (arr[month] > max) {
                max = arr[month];
                maxSalesMonth = month + 1;
            }
        }
        return maxSalesMonth;
    }

    public int minSalesSum(long[] arr) {
        int minSalesSum = 1;
        long min = arr[0];
        for (int month = 0; month <= arr.length - 1; month++) {
            if (arr[month] < min) {
                min = arr[month];
                minSalesSum = month + 1;
            }
        }
        return minSalesSum;
    }

    public int monthOfUnderAverageSum(long[] arr) {
        int monthOfUnderAverageSum = 0;
        long avg = averageAllSalesSum(arr);
        for (int month = 0; month <= arr.length - 1; month++) {
            if (arr[month] < avg) {
                monthOfUnderAverageSum++;
            }
        }
        return monthOfUnderAverageSum;
    }

    public int monthOfOverAverageSum(long[] arr) {
        int monthOfOverAverageSum = 0;
        long avg = averageAllSalesSum(arr);
        for (int month = 0; month <= arr.length - 1; month++) {
            if (arr[month] > avg) {
                monthOfOverAverageSum++;
            }
        }
        return monthOfOverAverageSum;
    }
}

