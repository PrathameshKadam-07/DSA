package String;

public class SumofBeautyofAllSubstrings {
    public int beautySum(String s) {
        int n = s.length();
        int total = 0;
        
        for(int i = 0;i<n;i++) {
        	int[] freq = new int[26];
        	
        	for(int j = i;j<n;j++) {
        		freq[s.charAt(j)-'a']++;
        		
        		int max = 0;
        		int min = Integer.MAX_VALUE;
        		
        		for(int f :freq) {
        			if(f>0) {
        			min = Math.min(min, f);
        			max = Math.max(max, f);
        		}
        		}
        		
        		total += (max-min);
        	}
        }
        return total;
    }
    public static void main(String[] args) {
    	SumofBeautyofAllSubstrings s =  new SumofBeautyofAllSubstrings();
    	String st = "aabcbaa";
    	
    	System.out.println(s.beautySum(st));
	}
}
