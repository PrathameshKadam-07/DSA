package prac;

public class recursiondigit {
	
	public static void num(int n) {
		if(n==0) return;
		num(n/10);
		System.out.print(n%10 +" ");
	}
	
public static void main(String[] args) {
	int n =1234;
	num(n);
}
}
