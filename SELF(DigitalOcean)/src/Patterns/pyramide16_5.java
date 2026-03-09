package Patterns;

public class pyramide16_5 {
public static void main(String[] args) {
	int r = 9;
	
	for(int i = 1;i<=9;i++) {
		
		for(int s = 0;s<i;s++) {
			System.out.print(" ");
		}
		
		for(int j = r-i;j >=0;j--) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
}
}
