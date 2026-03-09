package prac;

public class Recursion_fibo {
	public static void print(int a,int b,int n) {
		if(b > n) return;
		System.out.print(b+ " ");
		int c = a+b;
		print(b,c,n);
	}
	
public static void main(String[] args) {
	int a = 0,b=1;
	int n = 10;
	System.out.print(a+ " ");
	print(a,b,n);
}
}
