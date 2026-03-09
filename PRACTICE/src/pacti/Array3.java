package pacti;
import java.sql.*;
import java.util.*;

public class Array3{
 public static void main(String[] args) throws SQLException 
 {
  Connection con=null;	 
  try
   {
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","pratap","root");
	Scanner sc= new Scanner(System.in);
	con.setAutoCommit(false);
	//Op1: Read 1st A/c
	System.out.print("Enter the 1st Account No:");
	int acno1=sc.nextInt();
    PreparedStatement ps1= con.prepareStatement("select * from account where ano=?");	
	ps1.setInt(1,acno1);
	ResultSet rs1=ps1.executeQuery();
	System.out.println("1st Account Details:");
	if(rs1.next())
	{
		System.out.println(" Account No:"+rs1.getInt(1)+" Customer Name:"+rs1.getString(2)+" Balance:"+rs1.getInt(3));
	}
	else
	{
		throw new SecurityException("Invalid Account Number...");
	}
	
	//Op2: Withdraw amount from 1st A/c
    System.out.print("Enter the amount to be transfer:");
    int amt1=sc.nextInt();
    PreparedStatement ps2=con.prepareStatement("update account set bal=bal-? where ano=?");
	ps2.setInt(1,amt1);
	ps2.setInt(2,acno1);
	
	int i=ps2.executeUpdate();
	if(i>0)
	{
		System.out.println("Amount withdraw successfully..");
	}
	

	//Op3: Read 2nd A/c
	System.out.print("Enter the 2nd Account No:");
	int acno2=sc.nextInt();
    PreparedStatement ps3= con.prepareStatement("select * from account where ano=?");	
	ps3.setInt(1,acno2);
	ResultSet rs2=ps3.executeQuery();
	System.out.println("2nd Account Details:");
	if(rs2.next())
	{
		System.out.println(" Account No:"+rs2.getInt(1)+" Customer Name:"+rs2.getString(2)+" Balance:"+rs2.getInt(3));
	}
	else
	{
		throw new SecurityException("Invalid Account Number...");
	}	
	//Op4: Add/Transfer amount in 2nd Account
	PreparedStatement ps4=con.prepareStatement("update account set bal=bal+? where ano=?");
	ps4.setInt(1,amt1);
	ps4.setInt(2,acno2);
	i=ps4.executeUpdate();
	if(i>0)
	{
		System.out.println("Amount Transfer successfully..");
	}
	
	// Op5: display Accounts
    PreparedStatement ps5= con.prepareStatement("select * from account where ano in(?,?)");	
	ps5.setInt(1, acno1);
	ps5.setInt(2, acno2);
    ResultSet rs3=ps5.executeQuery();
	System.out.println("Account Details:");
	while(rs3.next())
	{
		System.out.println(" Account No:"+rs3.getInt(1)+" Customer Name:"+rs3.getString(2)+" Balance:"+rs3.getInt(3));
	}
	con.commit();
	con.close();
   }
   catch(ClassNotFoundException e) 
   {
 	e.printStackTrace();
   }
   catch(SQLException e) 
   {
 	e.printStackTrace();	
   } 
   catch(SecurityException e) 
   {
	con.rollback();
	e.printStackTrace();
   }
 }//end main
}//end class