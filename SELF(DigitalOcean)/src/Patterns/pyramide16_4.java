package Patterns;

public class pyramide16_4 {
public static void main(String[] args) {
	int r = 9;
	
	for(int i = 1;i<=r;i++) {
		
		for(int s = 0;s<r-i;s++) {
			System.out.print(" ");
		}
	
	for(int j=1;j<=i;j++) {
		System.out.print(j);
	}
		
	for(int z =i-1;z > 0 ;z--) {
		System.out.print(z);
	}
	
	System.out.println();
	}
}
}
