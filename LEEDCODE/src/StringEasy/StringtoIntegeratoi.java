package StringEasy;

public class StringtoIntegeratoi {
	
    public int myAtoi(String s) {
        if(s.length() == 0){
        return 0;
    }
    int num = 0;
    String s1 = s.trim();
    int sign = 1;
    
    if(s1.charAt(0) == '-' || s1.charAt(0) == '+'){
    sign = (s1.charAt(0) == '-' ? -1 : 1);
    
        
    for(int i = 1;i<s1.length();i++){
           if(s1.charAt(i) - '0' >=0 && s1.charAt(i) - '0'<=9){
        	   
        	    int digit = s1.charAt(i) - '0';

        	    if(num > Integer.MAX_VALUE/10 || 
        	       (num == Integer.MAX_VALUE/10 && digit > 7)){
        	        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        	    }
        	   
               num = (num*10)+digit;
           }    
            else{
                return (num*sign);
            }
        }}
    
    else if(s1.charAt(0) - '0' >= 0 && s1.charAt(0) - '0'<= 9){
        for(int i = 0;i<s1.length();i++){
           if(s1.charAt(i)-'0' >=0 && s1.charAt(i)-'0' <=9){
        	   
       	    int digit = s1.charAt(i) - '0';

       	    if(num > Integer.MAX_VALUE/10 || 
       	       (num == Integer.MAX_VALUE/10 && digit > 7)){
       	        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
       	    }
       	   
              num = (num*10)+digit;
           }    
            else{
                return (num*sign);
            }
        }
    }
        else {
            return 0;
        }
      return (num*sign);
    }
}
    
public static void main(String[] args) {
	String s = " -1337c0d3";
	
}
}
