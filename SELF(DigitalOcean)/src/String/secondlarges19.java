package String;

import java.util.Arrays;

public class secondlarges19 {
	public static int higher(int[] arr) {
		for(int i =arr.length-1;i>=0;i--) {
			if(arr[i]!=arr[i-1]) {
				return arr[i-1];
			}
			else {
				return 0;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] ar = {1,2,1,5,3,1};
		Arrays.sort(ar);
		int a =higher(ar);
		if(a==0) {
			System.out.println("ALL THE ELEMENT ARE SAME");
		}
		else {
			System.out.println(a+" :is the second Highest");
		}
	}

}
