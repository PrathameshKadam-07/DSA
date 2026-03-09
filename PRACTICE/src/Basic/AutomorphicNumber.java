package Basic;
//Check for Automorphic Number
//
//Input: 25 → 25² = 625 → Ends with 25 → Automorphic

import java.util.Scanner;
public class AutomorphicNumber {
	
	static void acnum(int a) {
		int p = a*a;
	
if(a == (p%100)) {
	System.out.println("its an Automorphic Number");
}
else {
	System.out.println("NOT an automorphir Number");
}
	}
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the number:");
int a = sc.nextInt();
	 acnum(a);
}
}
