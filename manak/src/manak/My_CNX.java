package manak;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Bharat
 */
public class My_CNX {
    private static String servername="localhost";
    private static String username="root";
    private static String password="";
    private static String dbname="manak";
    private static Integer portnumber=3306;
   
   public static Connection getConnection(){
      Connection cnx =null;
     
      MysqlDataSource datasource = new MysqlDataSource( );
      datasource.setServerName(servername);
      datasource.setUser(username);
      datasource.setPassword(password);
      datasource.setDatabaseName(dbname);
      datasource.setPortNumber(portnumber);
     
        try {
            cnx=datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection ->" + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
     
      return cnx;
    }
}
