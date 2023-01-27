package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class deleterowfromDataBase {

	
		public static void main(String[] args) throws SQLException {
			// step1: Create instance for JDBC Driver
			// Driver should be imported from com.mysql.cj.jdbc
			// new Driver(); throw SQLException

			Driver dbDriver = new Driver();

			// Step2: Register driver to JDBC
			DriverManager.registerDriver(dbDriver);

			// Step3: Establish the connection
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/wcsa3", "root", "root");

			// Step4:Create Statement
			Statement state = connect.createStatement();

			// Step5:Excute Query
			int result = state.executeUpdate(" delete from students  where id=107");

			System.out.println(result);

			// Step6: close database connection

			connect.close();

	


	}

}
