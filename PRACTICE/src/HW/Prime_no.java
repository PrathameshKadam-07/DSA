package HW;

import java.util.Scanner;

//Accept a number from the user and check if it is prime or not.
public class Prime_no {
	void prime(int n) {
		int c =0;
		for(int i = 2; i<n/2;i++) {
			if(n%i!=0) {
				continue;
			}
			else {
				c++;
			}
		}
		
		if(c==0) {	
		System.out.println("Number is Prime number");
		}
		else {
			System.out.println("NUmber is Not Prime");
		}
	}
	
public static void main(String[] args) {
	Prime_no o = new Prime_no();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = sc.nextInt();
	
	o.prime(n);
	
}
}
