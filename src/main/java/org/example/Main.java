package org.example;

import ListPerformance.ListPerformance;

public class Main {

    public static void main(String[] args) {
        int operationsCount = 1000;

        ListPerformance listPerformance = new ListPerformance(operationsCount);
        listPerformance.testAddPerformance();
        listPerformance.testGetPerformance();
        listPerformance.testRemovePerformance();
    }
}
