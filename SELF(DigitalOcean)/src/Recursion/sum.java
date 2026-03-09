package prac;

public class sum {
	
	
	public static int ans(int n) {
		if(n==0) return 0;
		return n + ans(n-1);
	}
public static void main(String[] args) {
	int n = 5;
	System.out.println(ans(n));
}
}
