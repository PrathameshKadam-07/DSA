package Arrays;

import java.util.Arrays;

public class LongestConsecutiveSequenceinanArray {
	
	public void longestconsecutive(int[] ar) {
		
		Arrays.sort(ar);
		int longest = 0;
		for(int i = 0;i<ar.length;i++) {
			int lon = 1;
			for(int j = i;j<ar.length-1;j++) {
				if(ar[j]+1 == ar[j+1]) {
					lon++;
				}
				else {
					break;
				}
			}
			
			longest = Math.max(longest, lon);
		}
		
	 System.out.println(longest);
	}
	
public static void main(String[] args) {
	int[] ar = {100, 4, 200, 1, 3, 2};
	LongestConsecutiveSequenceinanArray ac = new LongestConsecutiveSequenceinanArray();
	ac.longestconsecutive(ar);
	
}
}
