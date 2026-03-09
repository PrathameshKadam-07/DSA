package String;

public class palindrone7 {
public static void main(String[] args) {
	String s = "karak";
	
	StringBuilder sb = new StringBuilder();
	char str[] = s.toCharArray();
	for(int i = str.length-1;i>=0;i--) {
		sb.append(str[i]);
	}
	
	if(sb.toString().equals(s)) {
		System.out.println("Yes it a Palindrone");
	}
	else {
		System.out.println("Not a Palindrone");
	}
}
}
