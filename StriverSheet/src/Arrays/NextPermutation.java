package Arrays;

import java.util.Arrays;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
    	int n = nums.length - 2;
    	int l = nums.length - 1;
    	
    	
    	while(n>=0 && nums[n] >= nums[n+1]) {
    		n--;
    	}
    	
        if (n >= 0) {
            while (nums[l] <= nums[n]) {
                l--;
            }
            Swap(n, l, nums);
        }
    	
    reverse(n + 1, nums.length - 1, nums);
    	
    	System.out.println(Arrays.toString(nums));
    }
    
    public void Swap(int s,int e,int[] ar) {
    		int temp = ar[s];
    		ar[s] = ar[e];
    		ar[e] = temp;
    }

    private void reverse(int start,int end,int[] nums) {
        while (start < end) {
            Swap(start, end,nums);
            start++;
            end--;
        }
        }
        
    public static void main(String[] args) {
    	int[] arr = {1,2,3};
    			
    	NextPermutation np = new NextPermutation();
    			np.nextPermutation(arr);
    } 
}
