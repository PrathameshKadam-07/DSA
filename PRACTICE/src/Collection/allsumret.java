package Collection;
import java.util.LinkedHashSet;

public class allsumret {
public static void main(String[] args) {
	Integer[] ar = {1,5,7,-1,5};
	LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
	int sum = 6;
	for(int i = 0;i<ar.length;i++) {
		for(int j = i+1;i<ar.length;j++) {
			if(sum == ar[i] + ar[j]) {
			lh.add(ar[i]);
			lh.add(ar[j]);
			}
		}
		
	}
for(Integer i = 0;i<lh.size();i=i+2) {
	
}
}
}
