package Basic;
import java.util.Scanner;
//Print Fibonacci Series up to N terms

public class Fibo {
    void printFibonacci(int n) {
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series: ");
        while (a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        
        Fibo obj = new Fibo();
        obj.printFibonacci(n);
    }
}
