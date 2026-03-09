package EasyQuestion;

import java.util.Arrays;

public class zeroAtend {
	public static int[] zero(int[] ar) {
		int end = ar.length-1;
		for(int i = 0;i<ar.length-1;i++) {
			if(ar[i] == 0) {
			for(int j = i;j<ar.length-1;j++) 
			{
			
				ar[j] = ar[j+1];
			}
			ar[end] = 0;
		}
		}
		
		return ar;
	}
public static void main(String[] args) {
	int[] ar = {0,1,0,2,3};
	System.out.println(Arrays.toString(zero(ar)));
}
}
