package String;

public class LargestOddNumberinString {
	 public String largestOddNumber(String num) {
	    	int n = 0;
	    	int ans = 0;
	    	StringBuilder sb = new StringBuilder();
	        for(int i = 0;i<num.length();i++) {
	        	n = (n*10)+ (num.charAt(i) - '0');
	        }
	        
	        while(n>0) {
	        	if(n%2!=0) {
	        		ans = n;
	        		break;
	        	}
	        	else {
	        		n=n/10;
	        	}
	        }
	        if(ans == 0){
	            return "";
	        }
	     
	        String s = ans+"";
	        return s;
	    }
	
	public static void main(String[] args) {
	
}
}
