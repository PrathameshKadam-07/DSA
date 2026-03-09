package String;

import java.util.Scanner;

public class swapwithout3rdvariable {
	public static void swap(int a ,int b){
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Num:");
		int a =sc.nextInt();
		System.out.println("Enter a second number:");
		int b = sc.nextInt();
		
		swap(a,b);

	}

}
