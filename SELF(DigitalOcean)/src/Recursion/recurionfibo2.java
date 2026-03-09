package prac;

public class recurionfibo2 {
	
	public static void fib(int n,int a,int b) {
		int c =a+b;
		if(c>=n) return;
		System.out.print(" "+c);
		fib(n,b,c);
	}
public static void main(String[] args) {
	int n = 10;
	int a =0,b=1;
	System.out.print(a+" "+b);
	fib(n,a,b);
}
}
