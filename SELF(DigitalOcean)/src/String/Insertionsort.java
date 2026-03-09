package String;

import java.util.Arrays;

public class Insertionsort {
	
	public static void sort(int[] arr) {
		for(int i = 1;i<arr.length;i++) {
			for(int j = i-1;j>=0;j--) {
				if(arr[j+1]<arr[j]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
				}
			}
		}
	}
	
public static void main(String[] args) {
	int arr[] = {12,11,13,5,6};
	
	sort(arr);
	System.out.println(Arrays.toString(arr));
}
}
