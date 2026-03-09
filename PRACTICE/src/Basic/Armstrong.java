package Basic;
import java.util.Scanner;
public class Armstrong {
	static void arm(int a) {
		int n = a,rem = 0;
		for(int i = 0;i<3;i++) {
			int r =n%10;
			 rem= rem + (r*r*r);
			 n = n/10;
		}
		if(rem == a) {
			System.out.println("Yes "+a+" is a Armstrong number");
		}
		else {
			System.out.println("This no is not Armstrong");
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 3 digit number to check: ");
	int a =sc.nextInt();
	
	if(a>=100 && a<=999) {
		arm(a);	
	}
	else {
		System.out.println("Invalid input");
	}
}
}
