package airlinesbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserInfo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		userinfo();
		insertdata();

	}
	
	public static void insertdata() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/usersinfo";
		String UserName = "root";
		String Password = "1991";
		String query = "insert into userdetials values (?,?,?,?)";
		Connection con = DriverManager.getConnection(url,UserName,Password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, 4 );
		pst.setString(2, "Ram");
		pst.setString(3, "ram_125@yahoo.com");
		pst.setString(4, "61");

		
	
		
		int rows = pst.executeUpdate();
		System.out.println("Rows Affected :"+rows);
		con.close();
		
	}
	
	
	public static void userinfo() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/usersinfo";
		String UserName = "root";
		String Password = "1991";
		
		String query = "update userdetials set EmailAddress = 'amala_12@gmail.com', Age = '20' where UserID = 3";
		Connection con = DriverManager.getConnection(url,UserName,Password);
		PreparedStatement pst = con.prepareStatement(query);
		
	
		
		int rows = pst.executeUpdate();
		System.out.println("Rows Affected :"+rows);
		con.close();
	}

}
