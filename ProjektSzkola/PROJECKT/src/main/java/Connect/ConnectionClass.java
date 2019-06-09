package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 
public class ConnectionClass {
	Connection con = null;
	public static Connection getConnetion() throws SQLException {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/szko__a?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC ", "root", "");
	 
	 return connection;
	}
	 
}