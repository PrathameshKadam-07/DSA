package Cognizentq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class shopitem {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Items: ");
	int a = sc.nextInt();
	sc.nextLine();
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<Integer> discounts = new ArrayList<Integer>();
	System.out.print("Enter the item name,price,discount with comma: ");
	for(int i = 0;i<a;i++) {
		String str = sc.nextLine();
		String[] s = str.split(",");
		
		String name = s[0];
		int price = Integer.parseInt(s[1]);
		int des = Integer.parseInt(s[2]);
		
		int desC = (price*des)/100;
		discounts.add(desC);
		names.add(name);
	}
	
	int min  = Collections.min(discounts);
	
	for(int i = 0;i<a;i++) {
		if(discounts.get(i)==min) {
			System.out.println(names.get(i));;
		}
		
	}
	
}
}
