package prac;

public class Recursionrev {
static int r = 0;
	public static void rev(int n) {
		if(n == 0) return;
		r = r*10+n%10;
		rev(n/10);
	}
	
public static void main(String[] args) {
	int n =123;
	rev(n);
	System.out.println(r);
}
}
