package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {
Connection conectar=null;  

public Connection conexion(){

        try {
        Class.forName("com.mysql.jdbc.Driver");
        conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/nuevo_amanecer", "root", "");

        }catch (ClassNotFoundException | SQLException e){
    
System.out.print(e.getMessage());

}
    return conectar;
 
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
