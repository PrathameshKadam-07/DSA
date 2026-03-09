package Patterns;

public class paAd3 {
public static void main(String[] args) {
	int n = 5;
	for(int i =1;i<=5;i++) {
		for(int s = n-i;s>0;s--) {
			System.out.print(" ");
		}
		
		for(int j = 1;j<=i;j++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
}
}
