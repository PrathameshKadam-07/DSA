package Basic;
import java.util.Scanner;

public class Countnoofdigit {
static int c=0;

public static void count(int n) { 
while(n>0) {
	int r = n%10;
	n = n/10;
	if(r>0) {
		c = c+1;
	}
	else
	{
		break;
		}
	}

System.out.println("The Count is: "+c);
}

public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter The Number: ");
	int a = sc.nextInt();
	
	count(a);
}
}
