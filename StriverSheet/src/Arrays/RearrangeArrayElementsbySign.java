package Arrays;

public class RearrangeArrayElementsbySign {
	  public int[] rearrangeArray(int[] nums) {
	        int[] ar = new int[nums.length];

	        int neg = 1;
	        int pos = 0;

	        for(int num: nums){
	            if(num>0){
	                ar[pos] = num;
	                pos +=2;
	            }
	            else{
	                ar[neg] = num;
	                neg +=2;
	            }
	        }
	    return ar;
	    }
}
