package HW;
// With selling Price of a bag and cost price available, find whether profit incurred or loss.

import java.util.Scanner;

public class Profit_loss {
	void pl(int c,int s) {
		int res =0;
		if(s>c) {
			res =s-c;
			System.out.println("Profit: "+res);
		}
		else if(c>s){
			res = c-s;
			System.out.println("Loss: "+res);
		}
		else {
			System.out.println("No profit no loss");
		}
	}
	
public static void main(String[] args) {
	Profit_loss o = new Profit_loss();
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter Cost Prince");
	int cp = sc.nextInt();
	System.out.println("Enter Selling Prince");
	int sp = sc.nextInt();

	o.pl(cp,sp);
	}
}
