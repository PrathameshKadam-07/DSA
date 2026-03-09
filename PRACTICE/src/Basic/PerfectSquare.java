package Basic;
//Check for Perfect Number

import java.util.Scanner;
public class PerfectSquare {
static int c =0;
	static void perfect(int n) {
		int i = 2;
		while(i<n/2) {
			if((i*i) == n) {
				System.out.println(n+" is a perfect square: \n"+i+" * "+i+" = "+n);
			}
			else {
				c++;
			}
			i++;
		}
		
		if(c!=0) {
			System.out.println("NOT A PERFECT SQUARE");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a  number: ");
		int a = sc.nextInt();
		perfect(a);
	}
}
