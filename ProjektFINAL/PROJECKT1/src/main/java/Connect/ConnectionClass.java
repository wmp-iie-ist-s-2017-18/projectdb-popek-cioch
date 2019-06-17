package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 //po³aczenie z baza 
public class ConnectionClass {
	Connection con = null;
	public static Connection getConnetion() throws SQLException {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/szko__a-2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC ", "root", "");
	 
	 return connection;
	}
	 
}