package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 

public class ConnectionClass {
	public Connection Connect(){
		try {
	        String url="jdbc:mysql://localhost:3306/zal?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	        String user="root";
	        String haslo="Zaliczenie";

	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn = DriverManager.getConnection(url, user, haslo);
	    return conn;
	 } 
		catch (ClassNotFoundException ex) {
			Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return null;
	}}
	 
