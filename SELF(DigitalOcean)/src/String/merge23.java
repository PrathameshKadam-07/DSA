package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class merge23 {
public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,12,8,78,41));
	ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(8,4,54,1,7));
	ArrayList<Integer> merge = new ArrayList<Integer>();
	HashMap<Integer, String> hm  = new HashMap<Integer, String>();
	merge.addAll(l1);
	merge.addAll(l2);
	System.out.println(merge);
	
}
}
