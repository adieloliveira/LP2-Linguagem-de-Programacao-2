/**
 * Adiel da Silva de Oliveira
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaConnect {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=students";
		String user = "adiel";
		String password = "123456";

		public Connection getConnection() {
			try {
				return DriverManager.getConnection(url, user, password);				
			}			
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
	}
}		
