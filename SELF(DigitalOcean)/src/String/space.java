package String;

public class space {
public static void main(String[] args) {
	String st = "Prathames  h";
	StringBuilder sb = new StringBuilder();
	
for(int i = 0;i<st.length();i++) {
	if(st.charAt(i) != ' ') {
		sb.append(st.cwharAt(i));}
	}

System.out.println(sb);
}
}
