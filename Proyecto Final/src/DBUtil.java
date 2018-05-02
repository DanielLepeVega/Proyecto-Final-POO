/*
 * Gustavo Alejandro Flores Cortés
 * A01635151
 * 
 * Daniel Lepe Vega
 * A01633986
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	//private static final String USERNAME = "Admin";
	//private static final String PASSWORD = "qcuofdYL7RFD3fvI";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	private static final String M_CONN_STRING ="jdbc:mysql://localhost/bdpasaporte";

	public static Connection getConnection(DBType dbType) throws SQLException {
		
		switch (dbType) {
		case MYSQL:
			return DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);
		default:
			return null;
		}
		
	}
	
	public static void processException(SQLException e) {
		System.err.println("Error message: " + e.getMessage());
		System.err.println("Error code: " + e.getErrorCode());
		System.err.println("SQL state: " + e.getSQLState());
	}
	
}
