package jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTable {

	public static void main(String[] args) {
		
		try {
			//step 1: Load or register the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is load successfully");
			
			//step 2: create connection 
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnsif", "root", "root");
			System.out.println("Connection created successfully");
			
			//step 3: create a statement 
			Statement stmt=con.createStatement();
			
			System.out.println("Statement created succesfully");
			
			//step 4: write a query
			
//			String q="create table student(stdid int, name varchar(20), subject varchar(20), duration double)";
//			String q="insert into student value(101, 'zeel', 'HTML', 66.67)";
			String q="insert into student value(102, 'Heti', 'CSS', 48.29)";
//			alter
//			String q = "alter table student add primary key(stdid)";
			
			int s=stmt.executeUpdate(q);
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}