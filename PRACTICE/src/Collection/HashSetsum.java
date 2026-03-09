package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetsum {
	public static boolean sum(Integer[] ar,int sum,HashSet<Integer> h) {
		for(int x:ar) {
			int c = sum-x;
			if(h.contains(c)) {
				System.out.println("pair found: "+x +" "+ c);
				return true;
			}
			h.add(x);
		}
		return false;
	}
	
public static void main(String[] args) {
	  Integer[] arr = {8, 7, 2, 5, 3, 1};
      int sum = 10;
      HashSet<Integer> h = new HashSet<Integer>();
 System.out.println(sum(arr,sum,h));
}
}
