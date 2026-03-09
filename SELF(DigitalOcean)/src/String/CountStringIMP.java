package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountStringIMP {
	
	public static void count(char[] s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char c :s) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
				}
				else {
					hm.put(c, 1);
				}
			}
		System.out.println(hm);
		}
	
public static void main(String[] args) {
	String a= "jbbbbdhbHASBJH";
	char[] s = a.toCharArray();
	count(s);
}
}
