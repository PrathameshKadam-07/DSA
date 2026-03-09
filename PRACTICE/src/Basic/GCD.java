package Basic;
import java.util.Scanner;
public class GCD {
int a,b;

GCD(int a,int b){
	this.a =a;
	this.b =b;
}
	public void Find() {
		if(a>b) {
		int r = 1;
		while(r!=0) {
			r = a%b; 
			a = b;
			b = r;
		}
		System.out.println("GCD is of these number id: "+a);
	}
		else {
			System.out.println("first no Shoud be Grater than Second");
		}
		}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a = sc.nextInt();
		System.out.print("Enter the Second number:");
		int b =sc.nextInt();
		
		GCD o =new GCD(a,b);
		o.Find();
	}
}
