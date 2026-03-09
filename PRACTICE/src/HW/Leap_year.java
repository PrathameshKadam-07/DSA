package HW;
import java.util.Scanner;

public class Leap_year {

	void year(int y) {
		if(y%4 == 0 && y%100 != 0 || y%400 == 0) {
			System.out.println("Yes " +y+" is a leap year.");
		}
		else {
			System.out.println("NOT an leap year");
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Leap_year l = new Leap_year();
		
		System.out.println("Enter year: ");
		int y = sc.nextInt();
		
		l.year(y);
	}
}
