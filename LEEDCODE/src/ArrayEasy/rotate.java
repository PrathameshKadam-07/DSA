package ArrayEasy;

import java.util.Arrays;

public class rotate {
    public void rotatee(int[] nums, int k) {
    
    	reverse(0, nums.length-1, nums);
    	reverse(0, k-1, nums);
    	reverse(k, nums.length-1, nums);
    	
    	System.out.println(Arrays.toString(nums));
    }
    
    public void reverse(int s,int e,int[] arr) {
    	int left = s;
    	int right = e;
    	
    	while(left<right) {
    		int temp = arr[left];
    		arr[left] = arr[right];
    		arr[right] = temp;
    		
    		left++;
    		right--;
    	}
    }
    
    
   public static void main(String[] args) {
	rotate r = new rotate();
	int[] nums = {1,2,3,4,5,6,7};
	int k = 3;
	r.rotatee(nums, k);
} 
    
}
