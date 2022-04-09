package Conex;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con = null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemadejoyeria","root","");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de conxión de la base de datos");
        }catch(ClassNotFoundException ex ){
        }
        return con;
    }
}