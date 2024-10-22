package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

import com.col.Employee;







public class JdbcMain4 {

	public static void main(String[] args) {
		//create connection
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/trainingdb","root","Omkar@18");
			System.out.println("Connection created");
			
			PreparedStatement pstUpd=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			ArrayList<Employee> list=new ArrayList<Employee>();
			
			list.add(new Employee(701,"Omkar",20000,10,LocalDate.of(1989, 12,1)));
			list.add(new Employee(702,"Shiv",30000,10,LocalDate.of(1989, 12,1)));
			list.add(new Employee(703,"Sanket",25000,20,LocalDate.of(1989, 12,1)));
			list.add(new Employee(704,"Raje",50000,20,LocalDate.of(1989, 12,1)));
			
			for(Employee e: list)
			{
				int id=e.getEmpid();
				String name=e.getName();
				int sal=e.getSal();
				int deptid=e.getDeptid();
				Date d=Date.valueOf((e.getDob()));
				
				pstUpd.setInt(1, id);
				pstUpd.setString(2, name);
				pstUpd.setInt(3, deptid);
					
				
				pstUpd.setDate(4, d);
				pstUpd.setInt(5, sal);
				pstUpd.executeUpdate();
				
				
			}
			pstUpd.executeUpdate();

		
			con.close();
			
			
			
			
			
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}

	}

}
