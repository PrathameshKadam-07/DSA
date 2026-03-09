package EasyQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDublicateRemove {
	public static int dub(int[] nums) {
		ArrayList<Integer> l = new ArrayList<>();
		int k =0;
		Arrays.sort(nums);
		
		for(int x : nums) {
			if(l.contains(x)) {
				continue;
			}
			else
			{
				l.add(x);
			}
		}
		System.out.println(l);
		k = l.size();
		return k;
	}
	
public static void main(String[] args) {
	int[] nums = {1,2,1,2,1,2};
	System.out.println(dub(nums));
}
}
