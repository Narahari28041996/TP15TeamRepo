package DatabaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.bidi.Command;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {

	Connection conn;
	Driver driver;
	
	public void connectToDatabaseNinza_hrm() throws Throwable {
		 driver=new Driver();
		DriverManager.registerDriver(driver);
	conn=DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/?user=root");
		
	}
	public void connectToDataBase(String url , String username , String password) throws SQLException {
		DriverManager.registerDriver(driver);
		DriverManager.getConnection(url,username,password);		
	}
	public void closeDataBase() throws SQLException {
		conn.close();
	}
	public ResultSet executeSelectQuery(String query) throws SQLException {
		ResultSet result=null;
		
            Statement stat=conn.createStatement();
        result= stat.executeQuery(query);
        
        return result;
	}
	public int executeNonSelectQuery(String query) throws SQLException {
	Statement stat=	conn.createStatement();
int result=	stat.executeUpdate(query);
return result;
	}
	
}
