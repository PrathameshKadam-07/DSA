package Arrays;

import java.util.Arrays;

public class LengthofthelongestsubarraywithzeroSum {
public static void main(String[] args) {
	int[] arr = {6, -2, 2, -8, 1, 7, 4, -10} ;
	int n = 6;
	int max = 0;
	int sum =0;
	
	Arrays.sort(arr);
	
	for(int i = 0;i<arr.length;i++) {
		sum+=arr[i];
		if(sum == 0) {
			max = i+1;
		}
	}
	
	System.out.println(max);
}
}
