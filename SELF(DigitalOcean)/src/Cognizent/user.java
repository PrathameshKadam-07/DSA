package Cognizent;

import java.util.Scanner;

public class user {
	String online = "online";
	int lastseen;
	String user;
	
public void printStatus(String user,int lastseen) {
		this.lastseen = lastseen;
		this.user = user;
		System.out.println( user + "created");
		System.out.println( user + "goes" + online);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user entry yes(1) or no(0): ");
		int n = sc.nextInt();
		
		switch (n) {
		case 1: {
			String user = sc.nextLine();
			user u = new user();
			u.printStatus(user,15);
			
			break;
		}
		default:
			break;
		}
	}
}
