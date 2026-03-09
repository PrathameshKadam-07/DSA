package String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class oddarraylist7 {
	
	public static void odd(ArrayList<Integer> a) {
for(int x:a) {
	if(x %2 == 0) {
		continue;
	}
	else {
		System.out.println("List contain Odd");
		break;
	}
}
}
	
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter how many element you want to insert: ");
	int n = sc.nextInt();
	int i = 0;
	while(i<n) {
		System.out.println("Enter the number");
		a.add(sc.nextInt());
		i++;
	}
	
	System.out.println(a);
	
	odd(a);
}
}
