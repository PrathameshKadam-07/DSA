package String;

import java.util.Scanner;

public class Switchcase34 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int i =0;
	do {
		System.out.print("Enter a number form 1 - 7: ");
		int a = sc.nextInt();
	if(a>0 && a<8) {
		i =i-1;
		switch (a) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			System.out.println("Thusday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		case 7: {
			System.out.println("Sunday");
			break;
		}
	}
	}
	else {
		System.out.println("Invalid Input");
		i++;
	}
	}while(i == 1);
}
}
