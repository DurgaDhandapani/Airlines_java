package airlinesbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookingDetails {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		usersBooking() ;

	}
	
	public static void usersBooking() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/usersinfo";
		String UserName = "root";
		String Password = "1991";
		String query = "insert into bookingdetials values (?,?,?)";
		Connection con = DriverManager.getConnection(url,UserName,Password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, "IS 2564" );
		pst.setString(2, "Durga");
		pst.setString(3, "Air Asia");
	
		int rows = pst.executeUpdate();
		System.out.println("Rows Affected :"+rows);
		con.close();
	}

}
