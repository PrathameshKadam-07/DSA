package Patterns;

public class pyramide16_6 {
public static void main(String[] args) {
	int r = 9;
	
	for(int i = 9;i>0;i--) {
		for(int s =r-i;s>0;s--) {
			System.out.print(" ");
		}
		
		for(int j =i;j>0;j--) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
	}
}
}
