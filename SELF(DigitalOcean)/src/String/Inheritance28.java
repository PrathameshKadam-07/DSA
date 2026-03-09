package String;

class vecar{
	int a = 10;
	StringBuilder sc = new StringBuilder("-VILLAN");
	
	public void diss() {
		System.out.print("HERO");
	}
}
class Inheritance28 extends vecar{
	public void disss() {
		diss();
		a +=10;
		System.out.print(sc+ " "+a);
	}
	
	public static void main(String[] args) {
		Inheritance28 i = new Inheritance28();
		i.disss();
	}
}
	

