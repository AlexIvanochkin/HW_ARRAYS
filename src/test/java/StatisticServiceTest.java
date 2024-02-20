import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.StatisticService;

public class StatisticServiceTest {

    @Test
    void calculatorSumAllSales(){
        StatisticService services = new StatisticService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = services.allSalesSum(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculatorAverageOfAllSales() {
        StatisticService service = new StatisticService();
        long[] arr = {8, 34, 13, 15, 17, 20, 20, 2, 7, 14, 14, 8};
        long expected = 14;
        long actual = service.averageAllSalesSum(arr);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void calculatorMaxSalesMonth() {
        StatisticService service = new StatisticService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 34, 18};
        long expected = 11;
        long actual = service.maxSalesMonth(arr);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void calculatorMinSalesSum() {
        StatisticService service = new StatisticService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSalesSum(arr);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void calculatorOfUnderAverageSum() {
        StatisticService service = new StatisticService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthOfUnderAverageSum(arr);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void calculatorOfOverAverageSum() {
        StatisticService service = new StatisticService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthOfOverAverageSum(arr);

        Assertions.assertEquals(expected, actual);
    }
}
