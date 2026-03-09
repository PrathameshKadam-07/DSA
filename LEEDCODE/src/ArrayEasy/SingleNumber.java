package ArrayEasy;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        for(int i = 0;i<nums.length-1;i++) {
        	int cnt=0;
        	for(int j = 0;j<nums.length-1;j++) {
        		if(i==j) {
        			continue;
        		}
        		else if(nums[i]==nums[j]) {
        			cnt++;
        		}
        	}
        	if(cnt==0) {
        		return nums[i];
        	}
        }
        
    }
}
