package Arrays;

import java.util.Arrays;

public class FindSecondSmallestandSecondLargestElementinanarray {

public static void main(String[] args) {
	int[] ar = {1, 2, 4, 7, 7, 5};
	if(ar.length == 1) {
		System.out.println("smallest second: -1");
		System.out.println("largest second : -1");
	}
	else {
	
	for(int i = 0;i<ar.length;i++) {
		for(int j = 0;j< ar.length-1; j++) {
			if(ar[j] > ar[j+1]) {
				int temp = ar[j+1];
				ar[j+1] = ar[j];
				ar[j] = temp;
			}
		}
	}
	
	System.out.println(Arrays.toString(ar));
	
	for(int i = 0;i<ar.length-1;i++) {
		if(ar[i] != ar[i+1]) {
			System.out.println("smallest second: "+ ar[i+1]);
			break;
		}
	}
	for(int i = ar.length-1;i>0;i--) {
		if(ar[i] != ar[i-1]) {
			System.out.println("largest second: "+ ar[i-1]);
			break;
		}
	}
}
}
}
