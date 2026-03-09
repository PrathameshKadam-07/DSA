package Patterns;

public class paAd5_diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 4;

for(int i = 1;i<=4;i++) {
	
	for(int s = n-i;s>0;s--) {
		System.out.print(" ");
	}
	
	for(int j =1;j<=i;j++) {
		System.out.print("*");
	}
	
	for(int j =1;j<i;j++) {
		System.out.print("*");
	}
	
	System.out.println();
}
//down 
for(int i = n;i>=1;i--) {
	
	for(int s = n-i;s>0;s--) {
		System.out.print(" ");
	}
	
	for(int j =1;j<=i;j++) {
		System.out.print("*");
	}
	
	for(int j =1;j<i;j++) {
		System.out.print("*");
	}
	
	System.out.println();
}
	}

}
