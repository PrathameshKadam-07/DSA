package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
	public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;

        HashMap<Integer,Integer> hm =  new HashMap<>();

        for(int num : nums){ 
            if(hm.containsKey(num)){
                    hm.put(num,hm.get(num) + 1);
            }
            else{
                hm.put(num,1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> em : hm.entrySet()){

            if(em.getValue() > n){
                list.add(em.getKey());
            }
            
        }
        return list;
    }
}
