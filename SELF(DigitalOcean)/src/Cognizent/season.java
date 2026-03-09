package Cognizentq;

import java.util.Scanner;

public class season {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the month: ");
	int a = sc.nextInt();
	
	
	switch (a) {
		case 3,4,5: {
			System.out.println("Season: Spring");
			break;
		}
		case 6,7,8: {
			System.out.println("Season: Summer");
			break;
		}
		case 9,10,11: {
			System.out.println("Season: Autumn");
			break;
		}
		case 12,1,2 : {
			System.out.println("Season: Winters");
			break;
		}
		default:
			System.out.println("Invalid Input");
		}
	}
}

