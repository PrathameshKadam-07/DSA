package Patterns;

public class pyramids16_ {
public static void main(String[] args) {
	int r=9;
	
	for(int i=0; i<r; i++) {
		
		for(int j = 0;j<r-i;j++) {
			System.out.print(" ");
		}
		
		for(int k =r-i;k<=r;k++) {
			System.out.print(k);
		}
		
		for(int l = r-1;l>=r-i;l--) {
			System.out.print(l);
		}
		
		System.out.println();
	}
}
}
