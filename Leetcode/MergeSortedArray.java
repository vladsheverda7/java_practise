package Leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int [] array_1 = new int[]{1,2,3, 0, 0 ,0};
        int [] array_2 = new int[]{2,5,6};

        int[] result = merge(array_1, 3, array_2,3);
        System.out.println(Arrays.toString(result));

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        nums1 = Arrays.copyOf(nums1, m + n);
        for(int i = m, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
        }
        for(int i = 0; i < nums1.length; i++) {
            for(int j = i+1; j<nums1.length; j++){
                int temp;
                if(nums1[i] > nums1[j]) {
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        return nums1;
    }
}


