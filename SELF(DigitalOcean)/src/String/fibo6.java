package String;

public class fibo6 {
public static void main(String[] args) {
	int a =0, b =1;
	int c =0;

	while( c < 20) {
System.out.print(a+" ");
c = a+b;
a = b;
b = c;
	}
}
}
