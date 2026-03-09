package HW;

import java.util.Scanner;

//Accept a number from the user. Reverse the number and print it.
public class REV_NUM_without_array {
	int r,rem =0;
	void rev(int n,int s) {	
		for(int i =0;i<s;i++) {
		 r = n%10;
		 rem = (rem*10)+r;
		 n = n/10;
		}
	}
	
	public String toString() {
		return "Reverse is:"+rem;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	REV_NUM_without_array o = new REV_NUM_without_array();
	
	System.out.print("How many digit no: ");
	int s = sc.nextInt();
	System.out.print("Enter a no: ");
	int n = sc.nextInt();
	
	o.rev(n,s);
	
	System.out.println(o);
	
}
}
