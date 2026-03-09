package pacti;

public class test {
	
public static void count(String s) {
	char[] ch = s.toCharArray();
int cnt = 0;
	 for(int i = 0;i<= s.length()-1;i++) {
			StringBuilder sb = new StringBuilder();
			
		 for(int j = 0;j<=i;j++) {
			 if()
				 sb.append(ch[j]);
			
		 }
		 
		 for(int z = 0 ;z <sb.length();z++) {
			 int cnta = 0 ;
			 int cntb = 0;
			 if(sb.charAt(z) == 'A') {
				 cnta++;
			 }
			 else if (sb.charAt(z) == 'B') {
				 cntb++;
			}

			 int cn = cnta-cntb;
			 if(cn == 0 || cn == 1 ) {
				 cnt++;
			 }
		 }
	 }
	
	
	System.out.println(cnt);
}
	
public static void main(String[] args) {
	String s = "AABBAB";
	
	count(s);
	
}
}
