package Patterns;

public class pa3 {
public static void main(String[] args) {
	int r =9;
	
	for(int i=1;i<=9;i++) {
		for(int s =r-i;s>0;s--) {
			System.out.print(" ");
		}
		
		for(int j = 1;j<=i;j++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
}
}
