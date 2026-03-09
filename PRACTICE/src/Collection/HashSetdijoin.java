package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetdijoin {
public static void main(String[] args) {
	Integer[] ar1 = {1,2,3,4};
	Integer[] ar2 = {5,6,7,8};

	HashSet<Integer> h = new HashSet<Integer>(Arrays.asList(ar1));
	HashSet<Integer> h1 = new HashSet<Integer>(Arrays.asList(ar2));
int c= 0;
	for(Integer i: h) {
	if(h1.contains(i)) {
		System.out.println("False");
		break;
	}
	else {
		c++;
	}
}
	if(c==h1.size()) {
		System.out.println("true");
	}
}
}
