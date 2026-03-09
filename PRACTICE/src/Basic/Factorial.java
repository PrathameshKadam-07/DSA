package Basic;

import java.util.Scanner;

//Find Factorial
public class Factorial {
	
	void Sum(int n) {
		int sum =1;
		for(int i = n;i>0;i--) {
			sum = sum*i;
		}
	System.out.println("Factorial is: "+sum);
	}

	public static void main(String[] args) {
		Factorial o = new Factorial();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to find Factorial: ");
		int n = sc.nextInt();
		o.Sum(n);
	}
}
