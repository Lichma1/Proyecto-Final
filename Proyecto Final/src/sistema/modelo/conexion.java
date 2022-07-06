package sistema.modelo;
/**
 *
 * @author manua
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexion {
   public Connection con=null;
    
    public static Connection Conectar(){
        Connection cn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Final","root","ua2022.py");
            
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(String.valueOf(e));
        }
    return cn;
    }
    
}