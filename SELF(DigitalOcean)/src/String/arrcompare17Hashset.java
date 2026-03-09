package String;

import java.util.Arrays;
import java.util.HashSet;

public class arrcompare17Hashset {
	
	public static boolean compare(Integer[] a1,Integer[] a2) {
		HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(a1));
		HashSet<Integer> hs1 = new HashSet<Integer>(Arrays.asList(a2));
		if(hs.size()!=hs1.size()) {
			return false;
		}
		else {
		for(Integer x:hs) {
			if(!hs1.contains(x)) {
				return false;
			}
			else {
				return true;
			}
		}
		}
		return false;}
	
public static void main(String[] args) {
	Integer[] arr = {1,2,2,3,4,5};
	Integer[] arr1 = {1,2,3,4,3,2};
	
	if(compare(arr,arr1)) {
		System.out.println("SAME");
	}
	else {
		System.out.println("Different");
	}
}
}
