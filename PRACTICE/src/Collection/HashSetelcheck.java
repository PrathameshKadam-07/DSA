package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetelcheck {
public static void main(String[] args) {
	Integer[] ar = {1,4,5,7,2,5,6,7,3,4,45,66};
	HashSet<Integer> s = new HashSet<>(Arrays.asList(ar));
	int n = 5;
	for(Integer i : s) {
		if(s.contains(n)) {
			System.out.println("Yes element is present");
		}
		else {
			System.out.println("Element not present");
		}
	}
}
}
