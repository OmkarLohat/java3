package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.time.LocalDate;





public class JdbcMain1 {

	public static void main(String[] args) {
		//create connection
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/trainingdb","root","Omkar@18");
			System.out.println("Connection created");
			
			Statement st=con.createStatement();
			
			st.executeUpdate("update employee set salary=55555 where empid=300");
			st.executeUpdate("insert into employee values(99,'Ramana',20,'1999-3-3',100000);");
			
			
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}

	}

}
