package StringEasy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.equals(" ") || s.equals("")){
            return true;
        }
        
        String s1 = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        int left = 0;
        int right = s1.length()-1;
        
        while(left<right) {
        	if(s1.charAt(left) != s1.charAt(right)) {
        		return false;
        	}
        	left++;
        	right--;
        }
        return true;
    }
    public static void main(String[] args) {
		String s ="A man, a plan, a canal: Panama";
		
		ValidPalindrome v = new ValidPalindrome();
		
		System.out.println(v.isPalindrome(s));
	}
}
