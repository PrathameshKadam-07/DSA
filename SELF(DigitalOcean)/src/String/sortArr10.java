package String;

import java.util.ArrayList;
import java.util.Arrays;

public class sortArr10 {
public static void main(String[] args) {
//	int arr[] = {8,20,5,4,7,29,38,3,1};
//			Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		int ar[] = {2,4,12,45,7,2,67};
		ArrayList<Integer> l = new ArrayList();
		for(int i = 0;i<ar.length;i++) {
			l.add(ar[i]);
}
		for(int i = 0;i<l.size()-1;i++) {
			for(int j = 0;j<l.size()-1;j++) {
				if(l.get(j) > l.get(j+1)) {
					int temp = l.get(j);
					l.set(j, l.get(j+1));
					l.set(j+1, temp);
			}
			}
			}
		
		System.out.println(l);
		}
}
