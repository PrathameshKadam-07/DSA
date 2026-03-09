package Cognizentq;

import java.util.Scanner;

public class IncrementCalculation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the sal: ");
	int a =sc.nextInt();
	System.out.println("Enter the rating 1 to 5:");
	float b = sc.nextFloat();
	float sal = 0;
	if(a <0 || b<1 || b>5) {
		System.out.println("Invalid Input");
	}
	else {
		if(b>=1 && b <=3) {
			sal = a + (0.1f*a);
		}
		else if(b>=3.1f && b<=4){
			sal = a + (0.25f*a);
		}
		else if(b>=4.1 && b<=5){
			sal = a + (0.3f*a);
		}
		int f = (int)sal;
		System.out.println(f);
	}
}
}
