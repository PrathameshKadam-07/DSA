package prac;
class recursion_gcd{
static int i = 2;
static int gcd = 1;

public static void n_gcd(int a, int b) {
    if (i > Math.min(a, b)) return;

    if (a % i == 0 && b % i == 0) {
        gcd = i;  // track the greatest common divisor
    }
    i++;
    n_gcd(a, b);
}

//public static int n_gcd(int a, int b) {
//    if (a == 0) return b;
//    n_gcd(a%b, a);
//}

public static void main(String[] args) {
	n_gcd(12, 18);
    System.out.println(gcd);  // prints 6
}
}