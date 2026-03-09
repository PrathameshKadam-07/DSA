package Cognizentq;

import java.util.Scanner;

public class movieTheater {
	public static int total(int pz,int puf,int cd) {
		int t = 0;
		t =pz*100+puf*20+cd*10;
		return t;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the pizza: ");
	int pz = sc.nextInt();
	System.out.print("Enter the puff: ");
	int puf = sc.nextInt();
	System.out.print("Enter the colddrink: ");
	int cd = sc.nextInt();
	
	int t = total(pz,puf,cd);
	System.out.println(t);
	System.out.println("ENJOY THE SHOW");
}
}
