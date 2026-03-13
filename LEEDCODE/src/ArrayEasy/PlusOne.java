package ArrayEasy;
import java.util.*;

public class PlusOne {
	  public int[] plusOne(int[] digits) {
for(int i = digits.length-1;i>=0;i++) {
	if(digits[i]<9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}
		  int[] ar = new int[digits.length+1];
		  ar[0] = 1;
		  return ar;
	    }
	
public static void main(String[] args) {

	
}
}
