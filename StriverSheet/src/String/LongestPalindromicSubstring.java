package String;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
    	int left = 0;
    	int right =0;
        if(s.length()%2 == 0) {
        	 left = (s.length()-1)/2;
        	 right = ((s.length())/2);
        	 }
        else {
        	left = s.length()/2;
       	 	right =s.length()/2;
        }
        
        	int st=0,ed=0;
        	while(true) {
        		if(s.charAt(left) == s.charAt(right)) {
        			st = left;
        			ed = right;
        			left--;
        			right++;
        		}else {
        			break;
        		}
        	}
        	
        	StringBuilder sb = new StringBuilder();
        	for(int i = st;i<=ed;i++) {
        		sb.append(s.charAt(i));
        	}
   return sb.toString();
    }
    
    
    public static void main(String[] args) {
    	String s = "babad";
    	LongestPalindromicSubstring l = new LongestPalindromicSubstring();
    	System.out.println(l.longestPalindrome(s));
    	}
}
