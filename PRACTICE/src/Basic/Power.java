package Basic;
//Find Power without Math.pow()
import java.util.Scanner;
public class Power {
static void pow(int a,int b) {
	int p = 1;
	for(int i = 0;i<b;i++) {
		p = p*a;
	}
	System.out.println("The power of "+a+" and "+b+" is: "+p);
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter two numbers");
	int a = sc.nextInt();int b = sc.nextInt();
	
	pow(a,b);
}
}
