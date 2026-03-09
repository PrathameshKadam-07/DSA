package Cognizentq;

import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the 1st number: ");
	int a = sc.nextInt();
	System.out.print("Enter the 2nd number: ");
	int b= sc.nextInt();
	if(a>=b || a<0 ||b<0) {
		System.out.println("Provide Valid Input");
	}
	
	else {
		int n = 0;
		if(a == 1) {
			n = a+2 ;
		}
		else {
			n =a;
		}
		while(n<b) {
		int c =0;
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println(n);
		}
		n++;
	}
	
}}}
