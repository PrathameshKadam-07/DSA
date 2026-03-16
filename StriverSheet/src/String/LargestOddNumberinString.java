package String;

public class LargestOddNumberinString {
	public String largestOddNumber(String num) {
	    StringBuilder sb = new StringBuilder();
	    for(int i = num.length()-1;i>=0;i--){
	        if((num.charAt(i)-'0') % 2 != 0 ){
	            for(int j = 0;j<=i;j++){
	                sb.append(num.charAt(j));
	            }
	            return sb.toString();
	        }
	    }

	    return "";
	}
	
	public static void main(String[] args) {
	
}
}
