package Cognizentq;

import java.util.Scanner;

public class Fuel {
	
	public static void count(float f,float d) {
		double con = (f/d);
		float miles=d*0.6214f;
		float gal=f*0.2642f;
	
		
		float ans = miles/gal;
		
		System.out.printf("%.2f",con*100);
		System.out.println();
		System.out.printf("%.2f",gal);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fuel: ");
		int f = sc.nextInt();
		System.out.print("Enter Distance: ");

int d = sc.nextInt();
if(f <1) {
	System.out.println(f+ " is invalid Input");
}
else if(d<1) {
	System.out.println(d+" is invalid Input");
}
else {
	count(f,d);
}
}
}
