package jdbcmysql;

import java.sql.*;
import java.sql.Date;

import java.util.*;

import com.col.Employee;






public class JdbcMain2 {

	public static void main(String[] args) {
		//create connection
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/trainingdb","root","Omkar@18");
			System.out.println("Connection created");
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from employee");
			ArrayList<Employee> list=new ArrayList<>();
			
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int deptid=rs.getInt("deptid");
				Date dob=rs.getDate("dob");
				float sal=rs.getFloat(5);
				
				
				System.out.println(id+"     "+name+"     "+deptid+"     "+dob+"     "+sal);
			}
			con.close();
	
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}

	}

}