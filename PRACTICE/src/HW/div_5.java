package HW;
import java.util.Scanner;
//Accept a number from the user and check if it is divisible by 5.
public class div_5 {
	
void div(int n) {
	if(n%5 == 0) {
		System.out.print("\nYES "+n+" is divisible by 5");
	}
	else {
		System.out.print("The no is not divisible");
	}
	}


public static void main(String args[]) {
Scanner sc =new Scanner(System.in);
div_5 d = new div_5();

System.out.print("Enter the number: ");

if(sc.hasNextInt()) {
	int num = sc.nextInt();
	d.div(num);
}

else {
	System.out.println("INVALID INPUT");
}

}
}
