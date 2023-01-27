package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchtheDatafromDatabase {

	public static void main(String[] args) throws SQLException {
		//step1: Create instance for JDBC Driver
		//Driver should be imported from com.mysql.cj.jdbc
		//new Driver(); throw SQLException
		Driver DbDriver=new Driver();
		
	
		//Step2: Register driver to JDBC
		DriverManager.registerDriver(DbDriver);
		
		
		//Step3: Establish the connection
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/wcsa3", "root","root");
		
		
		 //Step4:Create Statement
		Statement state=connect.createStatement();
		
		
		//Step5:Excute Query
		ResultSet result=state.executeQuery("select * from students");
		
		
		//Step6: print the result
		while(result.next()){
			System.out.print(result.getInt("id")+"\t"+result.getString("name")+"\t"+result.getInt("phone"));
			
			
		}
		
		
		
	}

}
