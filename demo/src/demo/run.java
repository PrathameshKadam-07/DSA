package demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class run {
	try
	  {
	   //Step 1: Load the Driver
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   //Step 2: Create the DB Connection
	   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","prathamesh","prathamesh");
	   //Step 3: Handle the Exception
	   //Step 4: Create SQL Query
	   String query="Select * from emp";
	   //Step 5: Associate SQL Query with statement object 
	   Statement stmt=con.createStatement();
	   //Step 6: get the Result
	   ResultSet rs=stmt.executeQuery(query);
	   //Step 7: Process the Result
	   while(rs.next())
	   {
		   System.out.println(""+rs.getInt(1)+" "+rs.getString("ename")+" "+rs.getInt(3));
	   }
	   //Step 8: Close the Connection
	   con.close();
	  }
	  catch (ClassNotFoundException e) 
	  {
		e.printStackTrace();
	  }
	  catch (SQLException e) 
	  {
		e.printStackTrace();	
	  }
	 }//end main
	}//end class
}
