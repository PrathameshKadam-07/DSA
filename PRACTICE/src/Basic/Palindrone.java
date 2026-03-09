package Basic;

import java.util.Scanner;
public class Palindrone {
void pal(int n) {
	int org = n,rem =0;
	
	while(n>0) {
		int r = n%10;
		rem = (rem *10)+r;
		n = n/10;
	}
	
	if(org == rem) {
		System.out.println("YES it is Palindrone");
	}
	else {
		System.out.println("Not an Palindrone");
	}
}
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no to check: ");
        int n = sc.nextInt();
        
        Palindrone o = new Palindrone();
        o.pal(n);
    
}
}
