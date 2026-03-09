package Patterns;

public class paAd4 {
public static void main(String[] args) {
	int n = 5;
	for(int  i=1;i<=5;i++) {
		for(int s =n-i;s>0;s--) {
			System.out.print(" ");
		}
		
		for(int j = i;j>=1;j--) {
			System.out.print(j);
		}
		for(int k = 1;k<i;k++) {
			System.out.print(k+1);
		}
		System.out.println();
	}
}
}
