package Cognizentq;

import java.util.HashMap;
import java.util.Scanner;

public class inchar {
	
	public static void display(int[] arr) {
		HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
		for(int a:arr) {
			hm.put(a, (char)a);
		}
		System.out.println(hm);
	}
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int[] arr = new int[4];
	int a = 0;
	System.out.println("Enter the 4 elements: ");
	for(int i = 0;i<4;i++) {
		arr[i] = sc.nextInt();
	}
	
	display(arr);
}
}
