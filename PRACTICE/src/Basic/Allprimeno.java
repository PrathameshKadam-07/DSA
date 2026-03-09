package Basic;

import java.util.Scanner;

//Print All Prime Numbers Between 1 to N
public class Allprimeno {

static void pr(int n) {
	for(int i =2;i<n;i++) {
		int c =0;
		for(int j = 2;j<i;j++) {
			
		if(i%j == 0) {
			c++;
			break;
		}
		}
		
		if(c==0) {
			System.out.print(i+" ");
		}
	}
}

public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter a number till that u want all prime no: ");
	int n = sc.nextInt();
	pr(n);
}
}