package SortingAlgorithms;

import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(1);
        l.add(7);
        l.add(9);
        l.add(2);
        l.add(6);

        bubbleSort(l);

        System.out.println(l);
    }

    public static void bubbleSort(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size() - 1 - i; j++) {
                if (l.get(j) > l.get(j + 1)) {
                    int temp = l.get(j + 1);
                    l.set(j + 1, l.get(j));
                    l.set(j, temp);
                }
            }
        }
    }
}
