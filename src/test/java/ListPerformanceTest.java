import ListPerformance.ListPerformance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListPerformanceTest {

    private final ListPerformance listPerformance = new ListPerformance(1000);

    @Test
    public void testArrayListAddPerformance() {
        long startTime = System.nanoTime();
        listPerformance.testAddPerformance();
        long endTime = System.nanoTime();
        assertTrue((endTime - startTime) < 100000000, "Performance test failed for ArrayList add");
    }

    @Test
    public void testArrayListGetPerformance() {
        long startTime = System.nanoTime();
        listPerformance.testGetPerformance();
        long endTime = System.nanoTime();
        assertTrue((endTime - startTime) < 10000000, "Performance test failed for ArrayList get");
    }

    @Test
    public void testArrayListRemovePerformance() {
        long startTime = System.nanoTime();
        listPerformance.testRemovePerformance();
        long endTime = System.nanoTime();
        assertTrue((endTime - startTime) < 10000000, "Performance test failed for ArrayList remove");
    }
}
