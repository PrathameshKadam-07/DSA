package Patterns;

public class pyramide16_3 {
public static void main(String[] args) {
	
	int r =9;
	
	for(int i = 0;i<r;i++) {
		
		for(int s = 0;s<r-i;s++) {
			System.out.print(" ");
		}
		
		for(int j = 0;j<=i;j++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
}
}
