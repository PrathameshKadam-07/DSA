package String;

import java.util.HashMap;

public class Stringandcound26 {
	
	public static void count(char[] ar) {
		HashMap<Character, Integer> hm =new HashMap<Character, Integer>();
		
		for(char c :ar) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
		
		System.out.println(hm);
}
	
public static void main(String[] args) {
	String s = "abajbhsbbbaAABJBab";

	char[] ar = s.toCharArray();
	
	count(ar);
	
}
}
