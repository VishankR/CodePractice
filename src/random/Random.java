package random;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Random {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/mds","mdsdev","mdsdev");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from patient");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
	if(null!=rs.getObject("first_name")) {
		System.out.println("hi");
	}
	}
}