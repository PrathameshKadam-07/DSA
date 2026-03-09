package String;

import java.util.Scanner;

public class stringvow {
	public static boolean vowel(String s) {
		StringBuilder sb = new StringBuilder(s.toLowerCase());
		for(int i = 0; i<sb.length();i++) {
			if(sb.charAt(i) == 'a' ||sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u') {
			 return true;
			}}
		return false;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a String:");
String s = sc.nextLine();

if(vowel(s)) {
	System.out.println("Yes Vowel is Present");
}
else {
	System.out.println("NO Vowels are not Present");
}
}
}
