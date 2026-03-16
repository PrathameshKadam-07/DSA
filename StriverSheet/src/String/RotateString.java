package String;

public class RotateString {
    public boolean rotateString(String s, String goal) {
    	char[] ch = s.toCharArray();
    		
        for(int i = 0;i<s.length();i++) {
        	if(new String(ch).equals(goal)) {
        		return true;
        	}
            else{
        	reverse(0,s.length()-1,ch);
        	reverse(0,s.length()-2,ch);
            }
        }
        
        return false;
    }
    
    public void reverse(int start,int end,char[] ch) {
    	
    	while(start<end) {
    		char c = ch[start];
    		ch[start] = ch[end];
    		ch[end] = c;
    		start++;
    		end--;
    	}

    }}
