package Collection;

public class HashSetFrepeated {
public static void main(String[] args) {
	int[] ar = {10,5,4,3,6};
	int a = 0;
	for(int i = 0;i<ar.length;i++) {
		for(int j = i+1;j<ar.length;j++) {
			if(ar[i] == ar[j]) {
				a = ar[i];
				break;
			}
		}
		if(a!=0) {
			System.out.println(a);
			break;
		}
		if(a==0) {
			System.out.println("no repeted element");
			break;
		}
	}
}
}
