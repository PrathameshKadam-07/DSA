package Patterns;

import java.util.Scanner;

public class pyramide16_1 {
	
	public static void print(int a) {
		for(int i =1;i<=a;i++) {
			
			for(int s =1;s<=a-i;s++) {
				System.out.print(" ");
				}

			for(int j = 1;j<=i;j++) {
				System.out.print(i+" ");
				}

System.out.println();
		}
	}

	public static void main(String[] args) {

System.out.print("ENter the Rows:");
Scanner sc = new Scanner (System.in);
int a =sc.nextInt();

print(a);
}}
