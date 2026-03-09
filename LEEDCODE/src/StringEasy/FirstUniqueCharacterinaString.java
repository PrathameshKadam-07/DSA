package StringEasy;

public class FirstUniqueCharacterinaString {

    public int firstUniqChar(String s) {
        int[] c = new int[26];
        int cnt =0,num = -1;
        for(int i = 0;i<s.length();i++) {
        	c[s.charAt(i)-'a']++;
        }
    	
        for(int j = 0; j<s.length();j++) {
        		if(c[s.charAt(j) - 'a'] == 1) {
        			return j;
        		}
        }
        return -1;
    }
    
    public static void main(String[] args) {
		String s = "laal";
		
		FirstUniqueCharacterinaString f = new FirstUniqueCharacterinaString();
		
		System.out.println(f.firstUniqChar(s));
	}
}
