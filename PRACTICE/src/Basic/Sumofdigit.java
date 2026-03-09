package Basic;

import java.util.Scanner;

//Sum of Digits
public class Sumofdigit {
    void Sum(int n) {
    	int sum = 0;
        System.out.print("Sum of Digit are: ");
while(n>0) {
	int r =n%10;
	sum= sum+r;
	n = n/10;
}
System.out.print(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the didgit: ");
        int n = sc.nextInt();
        
        Sumofdigit obj = new Sumofdigit();
        obj.Sum(n);
    }
}

