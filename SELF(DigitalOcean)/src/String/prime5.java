package String;

public class prime5 {
	public static int prime(int n) {
		int i = 2;
		int c = 0;
		while(i<n) {
			if(n%i==0) {
				c++;}
			i++;}
	return c;
	}
		
		
public static void main(String[] args) {
	int n = 10;
	if(prime(n) == 0) {
		System.out.println("YES it is a prime no");
	}
	else {
		System.out.println("No it is prime number");
	}

}
}
