package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        StatisticService service = new StatisticService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Сумма всех продаж " + service.allSalesSum(arr));

        System.out.println("Средняя сумма продаж в месяц " + service.averageAllSalesSum(arr));

        System.out.println("Номер месяца, в котором был пик продаж " + service.maxSalesMonth(arr));

        System.out.println("Номер месяца, в котором был минимум продаж " + service.minSalesSum(arr));

        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + service.monthOfUnderAverageSum(arr));

        System.out.println("Количество месяцев, в которых продажи были выше среднего " + service.monthOfOverAverageSum(arr));
    }
}