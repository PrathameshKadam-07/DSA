package Basic;

import java.util.Scanner;

public class HCF_LCM {
	int hcf(int a,int b) {
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	
	void lcm(int a,int b) {
		int lcm = (a*b)/hcf(a,b);
		System.out.println("The LCM is: "+lcm);
	}
	
public static void main(String[] args) {
	HCF_LCM o = new HCF_LCM();
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.print("Enter first no: ");
	a =sc.nextInt();
	System.out.print("Enter Second no: ");
	b =sc.nextInt();
	
	int c = o.hcf(a,b);
	System.out.println("THE HCF is: "+c);
	o.lcm(a,b);
	
}
}
