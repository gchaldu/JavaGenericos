package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista;

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        String s = strings.get(0); // No se necesita casting

        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        String[] strArray = {"1", "2", "3", "4", "5"};
        printArray(strArray);

        List list = new ArrayList();
        list.add("Hello");
        String s2 = (String) list.get(0);
    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.println(element);
        }
    }
}