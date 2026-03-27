package Arrays;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int c = 0;
        for(int i = 0;i<nums.length;i++) {
        	if(nums[i] ==1) {
        		c++;
        	}
        	else {
        		c=0;
        	}
            max = Math.max(max, c);
        }
        return max;
    }
    
    public static void main(String[] args) {
    	MaxConsecutiveOnes fc = new MaxConsecutiveOnes();
    		int[] nums = {1,1,0,1,1,1};
    	
    	System.out.println(fc.findMaxConsecutiveOnes(nums));	
    }
}
