package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetA_B {
public static void main(String[] args) {
	Integer[] ar1 = {1,2,3,4,5};
	Integer[] ar2 = {2,4};
	
	HashSet<Integer> h = new HashSet<>(Arrays.asList(ar2));
	
	for(int x : ar1) {
		if(!h.contains(x)) {
			System.out.print(x+" ");
		}
	}
}
}
