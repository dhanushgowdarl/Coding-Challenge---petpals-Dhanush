package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnUtil {

	public static void main(String[] args) {
        //Connection connection = null;

        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petpal","root","Dhanu@9606");
              
               System.out.println(con);
               System.out.println("Connected to the database!");
        }

         catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnUtil.class.getName()).log(Level.SEVERE,null,ex);
            System.err.println("Error connecting to the database!");
            //e.printStackTrace();
        } 
        catch(SQLException ex){
            Logger.getLogger(DBConnUtil.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}