package prac;

import java.util.Arrays;

public class BinarySearch {
public static int binary(int[] ar,int t) {
	int low = 0;
	int high = ar.length-1;
	
	while(low<=high) {
		int mid = (low+high)/2;
		
		if(ar[mid] == t) {
		   return mid;
		}
		else if(t<ar[mid]) {
			high = mid-1;
		}
		else {
			low = mid+1;
		}
	}
	
	return -1;
}
	
public static void main(String[] args) {
	int[] ar = {10,2,5,7,94,6};
	int t =5;
	Arrays.sort(ar);
int val = binary(ar,t);
if(val!=-1) {
	System.out.println("Sorted array: "+Arrays.toString(ar));
	System.out.println("Element is present at at index: "+val);
}
else {
	System.out.println("Not present in the array");
}
}
}
