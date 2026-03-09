package prac;

public class Recurion_fact {
	public static int print(int n,int fact,int i) {
		if(fact>n) return fact;
		
		fact *=i;
		return print(n,fact,i+1);
		
	}
	
public static void main(String[] args) {
	int n = 3,fact = 1;
	int ans = print(n,fact,1);
}
}
