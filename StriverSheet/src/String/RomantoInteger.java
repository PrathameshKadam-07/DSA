package String;

import java.util.HashMap;

public class RomantoInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm =  new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int num =0;
        for(int i = s.length()-1;i>=0;i--) {
        	if(i!=0  && ((s.charAt(i-1) == 'I' && s.charAt(i) == 'X') || (s.charAt(i-1) == 'I' && s.charAt(i) == 'V'))) {
        		num = num + (hm.get(s.charAt(i)) - hm.get('I'));
        		i--;
        	}
        	else if(i!=0  && ((s.charAt(i-1) == 'X' && s.charAt(i) == 'L') || (s.charAt(i-1) == 'X' && s.charAt(i) == 'C'))) {
        		num = num + (hm.get(s.charAt(i)) - hm.get('X'));
        		i--;
        	}
        	else if(i!=0  && ((s.charAt(i-1) == 'C' && s.charAt(i) == 'D') || (s.charAt(i-1) == 'C' && s.charAt(i) == 'M'))) {
        		num = num + (hm.get(s.charAt(i)) - hm.get('C'));
        		i--;
        	}
        	else{
        		num = num +hm.get(s.charAt(i));
        	}
        	
        }
        
        return num;
    }
	public static void main(String[] args) {
		RomantoInteger ri =  new RomantoInteger();
		String s = "MCMXCIV";
		
		System.out.println(ri.romanToInt(s));
	}
}
