package ArrayEasy;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    	int[] ar = new int[2];
    	
        for(int i = 0;i<nums.length;i++) {
        	for(int j = i+1;j<nums.length;j++) {
        		if(nums[i] + nums[j] == target) {
        			ar[0] = i;
        			ar[1] = j;
        		}
        	}
        }
        return ar;
    }
    public static void main(String[] args) {
    	TwoSum t = new TwoSum();
    int[] nums = {3,3};
    int target = 6;
    
    System.out.println( Arrays.toString(t.twoSum(nums, target)));
	}
}
