package String;

public class Occrance25 {
	
	public static String occ(String s,char a) {
		StringBuilder sb =new StringBuilder(s.toLowerCase());
		for(int i =0;i<sb.length();i++) {
		if(sb.charAt(i) == a) {
			sb.replace(i,i+1,"");
		}
		}
		
		return sb.toString();
	}
public static void main(String[] args) {
	String s ="jabjbqbHBAJHBHAb";
	char a = 'j';
	
	System.out.println(occ(s,a));
}
}
