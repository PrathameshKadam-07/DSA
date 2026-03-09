package Cognizentq;

import java.util.Scanner;

public class luckynumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int a = sc.nextInt();
if(a >999 && a<=9999) {
	int rem = 0;
	for(int i = 0;i<4;i++) {
		int r = a%10;
		rem = rem+r;
		a = a/10;
	}
	if(rem%3==0 || rem%5==0 || rem%7==0) {
		System.out.println("Lucky Number");
	}
	else {
		System.out.println("Sorry its not my lucky number");
	}
}
else {
	System.out.println(a+ " is not a valid car number.");
}
}
}
