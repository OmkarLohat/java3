package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.time.LocalDate;





public class JdbcMain3 {

	public static void main(String[] args) {
		//create connection
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/trainingdb","root","Omkar@18");
			System.out.println("Connection created");
			
			PreparedStatement pstUpd=con.prepareStatement("update employee set salary= ? where empid= ?");
			//PreparedStatement pstInsert=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			
			pstUpd.setInt(1, 101000);
			pstUpd.setInt(2,103);
			pstUpd.executeUpdate();
			
			//pstInsert.setInt(1, 444);
		//	pstInsert.setString(2, "Pradeep");
		//	pstInsert.setInt(3, 10);
			
		//	Date d=Date.valueOf(LocalDate.of(1999,1, 1));
		//	pstInsert.setDate(4, d);
			//pstInsert.setInt(5, 700000);
			
			
			
			//pstInsert.executeUpdate();
			con.close();
			
			
			
			
			
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}

	}

}