package Cognizent;

public class userPrint extends user {
	
	int timestamp;
	String on,user,of ;
	public userPrint(String A){
		this.user = A;
	}
	
	public void goOnline(){
		on = "online";
	}
	
	public void goOffline(){
		of = "offline";
	}
	
	public void goOffline(int timestamp){
		this.timestamp = timestamp;
	}
	
	public void pollStatus() {
		System.out.println("User" + user +" is created");
		System.out.println("User" + user +" goes " + on);
		System.out.println("User" + user +" goes offline at time "+timestamp);
		System.out.println("User" + user +" goes "+of);
	}
	
	public void printStatus(boolean online,int lastseen) {
	}
public static void main(String[] args) {
	userPrint user = new userPrint("A");

    user.goOnline();
    user.goOffline(15);

    user.pollStatus();
}
}
