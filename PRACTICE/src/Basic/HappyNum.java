package Basic;
//Number is Happy Number or Not

//Repeatedly sum squares of digits, result is 1 → Happy

import java.util.Scanner;
public class HappyNum {
	public static int sumof(int n) {
		int rem =0;
		
		while(n!=0) {
		int r = n%10;
		rem = rem+(r*r);
		n = n/10;
		}
		return rem;
	}
	public static boolean isHappy(int n) {
		while(n !=1 && n!=4) {
			n = sumof(n);
		}
		return n == 1;

	}

	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the number:");
int a = sc.nextInt();

if (isHappy(a)) {
    System.out.println("It's a Happy Number!");
} 
else {
    System.out.println("Not a Happy Number.");
}
}
}

