package Cognizentq;

import java.util.Scanner;

public class gatumtarun {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENter a number");
	int a = sc.nextInt();
	if(a<0) {
		System.out.println("INVALID INPUT");
		return;
	}
	
	int b = a;
	int rev = 0;
	while (b>0) {
	int r = b%10;
	rev = (rev*10)+r;
	b = b/10;
}
	if(a == rev) {
		System.out.println("Palindrone");
	}
	else {
		System.out.println("Not a Palindrone");
	}
	}
	
}
