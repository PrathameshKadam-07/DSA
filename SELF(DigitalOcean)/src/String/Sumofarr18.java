package String;

public class Sumofarr18 {
	public static int sum(int[] arr) {
		int sum=0;
		
		for(int x:arr) {
			sum =sum+x;
		}
		return sum;
	}
	
public static void main(String[] args) {
int[] ar = {1,1,1,1,1,1};

System.out.println(sum(ar));

}
}
