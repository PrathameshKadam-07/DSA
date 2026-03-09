package prac;

public class recursionstrrev {
	public static boolean rev(String s,int l,StringBuilder sb) {
		if(l==0) return true;
		sb.append(s.charAt(l-1));
		rev(s,l-1,sb);
		return sb.toString().equals(s);
	}
public static void main(String[] args) {
String s = "MADAM";
s.toLowerCase();
int l =s.length();
StringBuilder sb =new StringBuilder();
System.out.println(rev(s,l,sb));
}
}
