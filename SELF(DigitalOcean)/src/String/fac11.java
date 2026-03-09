package String;

public class fac11 {
public static void main(String[] args) {
	int n = 3;
	int fact = 1;
	while(n>1) {
		fact += n;
		n--;
	}
	System.out.println(fact);
}
}
