package pac1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DataBaseTest {

	public static void main(String [] args) throws Exception {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection conn=DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm","root","root");
	Statement stat=	conn.createStatement();		
	int result=	stat.executeUpdate("insert into project values('NH0080','kdsl','02/18/2025','john','created')");

		System.out.println(result);
	
	}
	
}
