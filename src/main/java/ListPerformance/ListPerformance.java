package ListPerformance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {

    private final int operationsCount;

    /**
     * Конструктор для создания экземпляра ListPerformance с количеством операций.
     *
     * @param operationsCount количество операций для тестирования
     */
    public ListPerformance(int operationsCount) {
        this.operationsCount = operationsCount;
    }

    /**
     * Тестирует производительность метода add для ArrayList и LinkedList.
     */
    public void testAddPerformance() {
        System.out.println("Тестируем добавление элементов...");

        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < operationsCount; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList - add(" + operationsCount + "): " + (endTime - startTime) + " ns");

        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < operationsCount; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList - add(" + operationsCount + "): " + (endTime - startTime) + " ns");
    }

    /**
     * Тестирует производительность метода get для ArrayList и LinkedList.
     */
    public void testGetPerformance() {
        System.out.println("Тестируем получение элементов...");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < operationsCount; i++) {
            arrayList.add(i);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < operationsCount; i++) {
            arrayList.get(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList - get(" + operationsCount + "): " + (endTime - startTime) + " ns");

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < operationsCount; i++) {
            linkedList.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < operationsCount; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList - get(" + operationsCount + "): " + (endTime - startTime) + " ns");
    }

    /**
     * Тестирует производительность метода remove для ArrayList и LinkedList.
     */
    public void testRemovePerformance() {
        System.out.println("Тестируем удаление элементов...");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < operationsCount; i++) {
            arrayList.add(i);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < operationsCount; i++) {
            arrayList.remove(0);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList - remove(" + operationsCount + "): " + (endTime - startTime) + " ns");

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < operationsCount; i++) {
            linkedList.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < operationsCount; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList - remove(" + operationsCount + "): " + (endTime - startTime) + " ns");
    }
}
