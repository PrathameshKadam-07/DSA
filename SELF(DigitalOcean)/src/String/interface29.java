package String;

interface car{
	int a =10; //public static final
	StringBuilder sb =new StringBuilder("MANS");
	public void run();
	
	static void hr() {
	 System.out.println("HR");
}
	default void hd() {
	 System.out.println("HD");
 }
}

public class interface29 implements car {
	public void run(){
		System.out.println("RUN");
		}
	public static void hel(){
		System.out.println("RUN");
		car.hr();
		
	}
public static void main(String[] args) {
	interface29 i = new interface29();
	i.run();
	
}
}
