package Patterns;

import java.util.Scanner;

public class pyramide16_2 {
	
	public static void print(int r) {
		for(int i = 1;i<=r;i++) {
			
			for(int s = 0;s<r-i;s++) {
				System.out.print(" ");
			}
			
			for(int j =1;j<=i;j++) {
				System.out.print(jw+" ");
			}
			
			System.out.println();
		}
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of rows:");
	int r = sc.nextInt();
	print(r);
}
}
