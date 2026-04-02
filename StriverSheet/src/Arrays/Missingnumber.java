package Arrays;

import java.util.Arrays;

public class Missingnumber {
public static void main(String[] args) {
	int[] arr = {8,2,4,5,3,7,1};
	Arrays.sort(arr);
	
	for(int i = 0;i<arr.length-1;i++) {
		if(arr[i]+1 != arr[i+1]) {
			System.out.println(arr[i]+1);
			break;
		}
	}
}
}
