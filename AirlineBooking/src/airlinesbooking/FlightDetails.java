package airlinesbooking;

import java.sql.*;

public class FlightDetails {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 flightdata();
		flightdata1();

	}

	
	  
	  public static void flightdata() throws Exception{
	  
	  String url = "jdbc:mysql://127.0.0.1:3306/usersinfo"; 
	  String UserName = "root"; 
	  String Password = "1991";
	  String query =  "insert into flightdetails values (?,?,?,?,?)"; 
	  Connection con =DriverManager.getConnection(url,UserName,Password); 
	  PreparedStatement pst =  con.prepareStatement(query);
	  pst.setInt(1, 1 );
	  pst.setString(2, "AirAsia");
	  pst.setString(3, "11:30");
	  pst.setString(4, "16:30"); 
	  pst.setString(5,"Chennai-Bangalore");
	  
	  int rows = pst.executeUpdate(); 
	  System.out.println("Rows Affected :"+rows);
	  con.close(); }
	 
	public static void flightdata1() throws Exception {

		String url = "jdbc:mysql://127.0.0.1:3306/usersinfo";
		String UserName = "root";
		String Password = "1991";
		String query = "insert into flightdetails values (?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url, UserName, Password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, 2);
		pst.setString(2, "AirIndia");
		pst.setString(3, "04:15");
		pst.setString(4, "08:25");
		pst.setString(5, "Calicut-Delhi");

		int rows = pst.executeUpdate();
		System.out.println("Rows Affected :" + rows);
		con.close();
	}

}
