package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetunion {
public static void main(String[] args) {
	Integer[] ar = {1,2,3};
	Integer[] ar1 = {3,4,5};
	
	HashSet<Integer> h = new HashSet<Integer>(Arrays.asList(ar));
	
	h.addAll(Arrays.asList(ar1));
	
	System.out.println(h);
 }
}
