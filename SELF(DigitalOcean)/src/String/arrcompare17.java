package String;

import java.util.ArrayList;
import java.util.Arrays;

public class arrcompare17 {
	public static void compare(int[] a1,int[] a2) {
		int c =0;
		if(a1.length!=a2.length) {
			System.out.println("BOTH are different");

		}
		
		for(int i =0;i<=a1.length-1;i++) {

			if(a1[i]==a2[i]) {
				c++;
			}
		}
		if(c == a1.length) {
			System.out.println("BOTH ARE SAME");
		}
		else {
			System.out.println("BOTH ARE DIFFERENT");
		}
	}
	
public static void main(String[] args) {
	int[] arr = {1,5,0,7,8,7};
	Arrays.sort(arr);
	int[] arr2 = {1,7,0,6,8,5};
	Arrays.sort(arr2);
	
	compare(arr,arr2);
}
}
