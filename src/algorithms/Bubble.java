package algorithms;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] nums = new int[]{5,2,4,6,1,3,2,6};

        bubbleSort(nums);

    }

    static void bubbleSort(int[] nums){

        int tenp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]){
                    tenp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tenp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
