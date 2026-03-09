package String;

public class rev {
	
	public static String rev(String n) {
		StringBuilder sb = new StringBuilder();
		
		char arr[] = n.toCharArray();
		for(int i =arr.length-1;i>=0;i--) {
			sb.append(arr[i]);
		}
		
		return sb.toString();
}
		

		
	public static void main(String[] args) {
		String s = "Prathamesh";
		System.out.println(rev(s));
	}
}