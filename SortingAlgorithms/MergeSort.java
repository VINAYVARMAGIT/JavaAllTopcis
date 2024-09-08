package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = { 6, 3, 8, 5, 9, 3, 0 };
        sort(a);

        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        if (a.length < 2)
            return;
        int[] left = new int[a.length / 2];
        int[] right = new int[a.length - left.length];

        for (int i = 0; i < left.length; i++)
            left[i] = a[i];
        for (int i = 0; i < right.length; i++)
            right[i] = a[left.length + i];

        sort(left);
        sort(right);
        mergeSort(left, right, a);
    }

    public static void mergeSort(int[] left, int[] right, int[] a) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length)
            a[k++] = left[i++];
        while (j < right.length)
            a[k++] = right[j++];
    }
}
