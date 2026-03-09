package ArrayEasy;

import java.util.ArrayList;

public class IntersectionofTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
    	int min = Math.min(nums1.length,nums2.length);
    	
        int[] arr = new int[min];
        int k = 0;
if(nums1.length<=nums2.length) {
        for(int i = 0;i<nums1.length-1;i++) {
        	for(int j=0;j<nums2.length-1;j++) {
        		if(nums1[i]==nums2[j]) {
        			arr[k] = nums1[i];
                    k++;
        			nums2[j] = 0;
        		}
        	}
        }
        }
else {
    for(int i = 0;i<nums2.length-1;i++) {
    	for(int j=0;j<nums1.length-1;j++) {
    		if(nums2[i]==nums1[j]) {
    			arr[k] = nums2[i];
                k++;
    			nums1[j] = 0;
    		}
    	}
    }
}
        
        return arr;
 
    }
}
