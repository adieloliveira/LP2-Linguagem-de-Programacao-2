/**
 * Adiel da Silva de Oliveira CB300726X
 */

import java.sql.Connection; 
import java.sql.SQLException; 

public class ConnectionTest {     
    public static void main(String[] args) throws SQLException {
         Connection connection = new JavaConnect().getConnection();
         System.out.println("Connection working!");
         connection.close();
     }
}