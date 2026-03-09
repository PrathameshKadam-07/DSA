package StringEasy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

       if(strs.length == 0) {
    	   return "";
       }
       String s = strs[0];
        
        for(int i = 1;i<strs.length;i++) {
            StringBuilder sb = new StringBuilder();
            
            int minLength = Math.min(s.length(), strs[i].length());
            
        	for(int j = 0;j<minLength;j++) {
        		if(s.charAt(j) == strs[i].charAt(j)) {
        			sb.append(s.charAt(j));
        		}
        		else 
        		{
        			break;
        		}
        	}
        	s = sb.toString();
        }
        
        return s;
    }
    
    public static void main(String[] args) {
    	String[] strs = {"plower","flow","flight"};
    	LongestCommonPrefix l = new LongestCommonPrefix();
    	
    			System.out.println(l.longestCommonPrefix(strs));
	}
}
