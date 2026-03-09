package String;

public class question36 {
	
	enum DaysOfWeek{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THUSDAY,FRIDAY,SATURDAY
	}
	
	enum cerials{
		captain_cru(30,0.33f),
		root_lose(20,0.2f),
		alphabe(10,0.1f);

		final int val;
		final float f;
		
		cerials(int val,float f) {
			this.val = val;
			this.f = f;
		}
	}
public static void main(String[] args) {
	DaysOfWeek day = DaysOfWeek.MONDAY;
	
	if(day == DaysOfWeek.MONDAY) {
		System.out.println("yes its monday");
	}
	
	for(DaysOfWeek a :DaysOfWeek.values()) {
		System.out.println(a);
	}
	
	System.out.println(cerials.root_lose.val+" "+cerials.root_lose.f);
}
}
