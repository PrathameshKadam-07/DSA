package prac;

public class recusionsumarray {
	static int sum=0;
	public static int sum(int[] ar,int l) {
		if(l==0) return 1;
		sum = sum+ar[l-1];
		sum(ar,l-1);
		return sum;
	}
public static void main(String[] args) {
	int[] ar = {1,1,4,1,1};
	int l = ar.length;
	System.out.println(sum(ar,l));
}
}
