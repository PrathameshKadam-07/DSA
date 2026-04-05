package Arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
    	
    	if(nums.length == 1) {
    		return nums[0];
    	}
    	
    	int max = 0;
        for(int i = 0;i<nums.length;i++) {
        	int sum = 0;
        	 for(int j = i;j<nums.length;j++) {
             	sum +=nums[j];
             	
             	max = Math.max(max, sum);
             }
        }
    	
    	return max;
    }
    
    public static void main(String[] args) {
		int[] ar = {5,4,-1,7,8};
		
		MaximumSubarray m = new MaximumSubarray();
		System.out.println(m.maxSubArray(ar));
	}
}
