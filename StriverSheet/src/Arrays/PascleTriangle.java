package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascleTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i =0 ;i<numRows;i++) {
        	ArrayList<Integer> list = new ArrayList<>();
        	
        	for(int j =0;j<=i;j++) {
        		if(j==0 || j==i) {
        			list.add(1);
        		}
        		else {
        			int val = result.get(i-1).get(j-1) + result.get(i-1).get(j);
        			list.add(val);
        		}
        		
        		result.add(list);
        	}
        }
        return result;
    }
}
