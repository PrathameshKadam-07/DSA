package String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledateformaat22 {
public static void main(String[] args) {
	Date d =new Date();
	SimpleDateFormat sd = new SimpleDateFormat("d-m-y");
	String date = sd.format(d);
	System.out.println(date);
}
}
