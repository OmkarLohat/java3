package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.time.LocalDate;





public class JdbcMain {

	public static void main(String[] args) {
		//create connection
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/trainingdb","root","Omkar@18");
			System.out.println("Connection created");
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from employee");
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int deptid=rs.getInt("deptid");
				Date dob=rs.getDate("dob");
				float sal=rs.getFloat(5);
				
				
				System.out.println(id+"     "+name+"     "+deptid+"     "+dob+"     "+sal);
			}
	
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}

	}

}