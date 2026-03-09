package EasyQuestion;

import java.util.Arrays;

public class plusOne {
	
	public static int[] one (int[] ar) {
		for(int i = ar.length-1;i>=0;i--) {
			if(ar[i]<9) 
			{
				ar[i]++;
				return ar;
			}
			else 
			{
				ar[i] = 0;
			}
			
			int[] arr = new int[ar.length+1];
			arr[0] = 1;
			return ar;
		}
		return ar;
	}
public static void main(String[] args) {
	int[] ar = {1,2,3};
	System.out.println(Arrays.toString(one(ar)));
}
}
