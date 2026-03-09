package String;

import java.util.Arrays;
import java.util.Random;

public class shufflearray20 {
	
	public static int[] shuffle(int[] arr,int l) {
		Random r =new Random();
		
		for(int i = 0;i<arr.length;i++) {
			int a = r.nextInt(arr.length);
			int temp = arr[a];
			arr[a]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
public static void main(String[] args) {
	int[] arr = {1,23,12,5,2,4};
	System.out.println(Arrays.toString(arr));
	int l = arr.length;
	
	System.out.println(Arrays.toString(shuffle(arr,l)));
}
}
