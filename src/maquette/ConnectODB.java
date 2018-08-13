
package maquette;

import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectODB {
    Connection cn=null;

    public ConnectODB(String user,String pass) {
         try {
 
			Class.forName("oracle.jdbc.driver.OracleDriver");
 
		} catch (ClassNotFoundException e) {
 
 
		}
 
		
 
		try {
 
			cn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", user,
					pass);
 
		} catch (SQLException e) {
 
		
 
		}
                
               
 
		
    }
    
     public Connection getCon()
                {
                    return cn;
                }
}
