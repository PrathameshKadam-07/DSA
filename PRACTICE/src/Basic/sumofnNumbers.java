package Basic;

import java.util.Scanner;

public class sumofnNumbers {
	
	public static void sum(int a) {
		int add = 0;
		for(int i =0;i<=a;i++) {
			add = add+i;
		}
		System.out.println("The sum of "+a+" numbers are: "+add);
	}
	
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the number: ");
	int a =sc.nextInt();
	sum(a);
}
}
