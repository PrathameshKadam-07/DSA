package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int x : nums){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }
            else{
                  hm.put(x,1);
            }
        }

        int max = 0;

        for(Map.Entry<Integer,Integer> m : hm.entrySet()){
            int num = m.getValue();
            if(max<num){
                max = num;
            }  
        }
            for(Map.Entry<Integer,Integer> m : hm.entrySet()){
            if(max==m.getValue()){
                return m.getKey();
            }  
        }

    return -1;  
    }
}
