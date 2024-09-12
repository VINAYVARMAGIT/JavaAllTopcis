package sortingalgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = { 3, 7, 93, 6, 1, 4 };
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
}
