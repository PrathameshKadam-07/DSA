package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
     
    	HashMap<Character, Integer> hm = new HashMap<>();
    	
    	for(char c: s.toCharArray()) {
    		if(hm.containsKey(c)) {
    			hm.put(c, hm.get(c)+1);
    		}
    		else {
    			hm.put(c,1);
    		}
    	}
    	
    	ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(hm.entrySet());
    	
//    	Collections.sort(list,(a,b) -> b.getValue() - a.getKey());
    	
    	for(int i = 0 ; i <list.size();i++) {
    		for(int j = 0;j<list.size()-1;j++) {
    			if(list.get(j).getValue()<list.get(j+1).getValue()) {
    				Map.Entry<Character,Integer> temp = list.get(j);
    				list.set(j,list.get(j+1));
    				list.set(j+1,temp);
    			}
    		}
    	}
    	StringBuilder sb = new StringBuilder();
    	for(Map.Entry<Character,Integer> entry: list) {
    		char c = entry.getKey();
    		int val = entry.getValue();
    		
    		for(int i = 0;i<el.getValue())
    	}
    	
    return list.toString();
    }
    
    public static void main(String[] args) {
    	
    	SortCharactersByFrequency s = new SortCharactersByFrequency();
		System.out.println(s.frequencySort("sasdaasd"));
	}
}
