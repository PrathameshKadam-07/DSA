package String;

public class MaximumNestingDepthoftheParentheses {
public int maxDepth(String s) {
        s = s.replaceAll("[^()]", "");
        int c=0,in=0,max =0;
        int rn = 0;
        for(int i= 0;i<s.length();i++) {
        	if(s.charAt(i) == '(') {
        		if(c != 0) {
        			c++;
        			max++;
        		}
        		else {
        			in++;
        			max++;
        		}
        		
        	}
        	else {
        		if(in!=0) {
        			in--;
        			if(max > rn) rn = max;
        			max--;
        		}
        		else {
        			c--;
        			max--;
        		}
        	}
        }
        return rn;
    }
public static void main(String[] args) {
	MaximumNestingDepthoftheParentheses s =  new MaximumNestingDepthoftheParentheses();
	
System.out.println( s.maxDepth("(1+(2*3)+((8)/4))+1"));
}
}
