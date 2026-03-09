package Cognizentq;

import java.util.ArrayList;
import java.util.Scanner;

public class course {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of course max is 20: ");
	int a =sc.nextInt();
	sc.nextLine();
	if(a<=0 || a>20) {
		System.out.println("Invalid Range");
	}
	else {
		ArrayList<String> l = new ArrayList<String>();
		for(int i = 1 ;i<=a;i++) {
			System.out.print("Enter"+i+" course names: ");
			l.add(sc.nextLine());
		}
		
		System.out.println("Enter the course to be search: ");
		String s = sc.nextLine();
		if(l.contains(s)) {
			System.out.println(s+" course is available.");
		}
		else {
			System.out.println(s+" course is not available.");
		}
	}
	
	
}
}
