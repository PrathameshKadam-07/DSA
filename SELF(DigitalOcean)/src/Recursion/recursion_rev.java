package prac;

public class recursion_rev {
	public static int rev(int a,int r) {
		if(a<1) return r;
		return rev(a/10,r*10+a%10); 
	}
public static void main(String[] args) {
	int a = 103;
	int ans = rev(a,0);
	System.out.println(ans);
}
}
