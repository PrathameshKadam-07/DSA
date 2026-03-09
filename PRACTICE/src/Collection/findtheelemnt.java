package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class findtheelemnt {
	public static void find(int[] ar) {
		HashMap<Integer,Integer> l = new HashMap<Integer,Integer>();	
		for(int x : ar) {
			if(l.containsKey(x)) {
				l.put(x, l.get(x)+1);
			}
			else {
				l.put(x, 1);
			}
		}
//		ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(l.entrySet());
	for(Map.Entry<Integer, Integer> x: l.entrySet()) {
		if(x.getValue() == 1) {
			System.out.print(x.getKey()+" ");
		}
	}
	
	}
	
public static void main(String[] args) {
	int[] ar = {1,2,2,3,3,4};
	find(ar);
	
}
}
