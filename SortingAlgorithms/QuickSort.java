package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
 
    public static void main(String[] args) {
        int [] nums ={4,9,3,8,2};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quickSort(int[] nums,int start,int end){
    
        if (start>=end) return; 
        int i =start;
        int j = end;
        int pivot = nums[(start+end)/2];
        while (i<=j) {
            while(nums[i]<pivot) i++;
            while(nums[j]>pivot) j--;
            if (i<j) {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;   
            }
            i++;
            j--;
            quickSort(nums, i, end);
            quickSort(nums, start, j);
        }
    }
}
