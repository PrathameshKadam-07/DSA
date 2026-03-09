package String;

import java.util.ArrayList;
import java.util.Arrays;


public class bubblesort {
	
	public static void sort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
public static void main(String[] args) {
	int arr[] = {17,2,5,31,28};
	sort(arr);

	System.out.println(Arrays.toString(arr));

}
}
