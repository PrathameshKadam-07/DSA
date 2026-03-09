package prac;

public class recursioncount {
	static int c = 0;
	public static int count(int n) {
		if(n==0) return 1;
		c++;
	count(n/10);
	return c;
	}
public static void main(String[] args) {
	int n =123456789;
  System.out.println(count(n));
}
}
