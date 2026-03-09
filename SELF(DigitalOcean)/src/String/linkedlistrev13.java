package String;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedlistrev13 {
public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList<Integer>();
	LinkedList<Integer> l2 = new LinkedList<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.print("How many number you want to insert:");
	int n = sc.nextInt();
for(int i =0;i<n;i++){
		System.out.print("Enter the number:");
		ll.add(sc.nextInt());
	}

for(int j = n-1;j>=0;j--){
l2.add(ll.get(j));
}
	System.out.println(ll);
	System.out.println(l2);
}
}
