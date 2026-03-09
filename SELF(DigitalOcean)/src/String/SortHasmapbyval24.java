package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortHasmapbyval24 {
public static void main(String[] args) {
HashMap<String, Integer> hm =new HashMap<String, Integer>();
hm.put("A", 1);
hm.put("B", 4);
hm.put("C", 6);
hm.put("D", 5);
hm.put("E", 5);
hm.put("F", 3);

ArrayList<Map.Entry<String, Integer>> al = new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());
Collections.sort(al,(e1,e2)->e1.getValue().compareTo(e2.getValue()));
System.out.println(al);
}
}
