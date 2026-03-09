package String;

public class tryCATCH30 {

public static void main(String[] args) {
	try {
		int a = 30/0;
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
