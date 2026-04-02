package Arrays;

import java.util.Arrays;

public class LongestSubarraywithgivenSumK {
public static void main(String[] args) {
	int[] nums = {-3, 2, 1};
	int k = 15;
	
	Arrays.sort(nums);
	int  sum = 0;
	int c = 0;
	for(int x:nums) {
		sum +=x;
		c++;
		if(sum == k) {
			System.out.println(c);
			break;
		}
	}
	
	if(sum != k) {
		System.out.println(0);
	}
}
}
