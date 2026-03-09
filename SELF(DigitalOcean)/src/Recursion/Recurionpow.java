package prac;

public class Recurionpow {
	
	public static int pow(int a,int b) {
		if(b<1) return 1;
		return a*pow(a,b-1);
		
	}
public static void main(String[] args) {
	int a = 2,b=2;
	int ans = pow(a,b);
	System.out.println(ans);
}
}
