package inventaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi_database {
    public static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        
        try{
            String url="jdbc:mysql://localhost/inventaria"; //url database
            String user="root"; //User database
            String pass=""; 
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");           
        }
        
        return mysqlconfig;
    }
    
    public static void main(String []args) throws SQLException{

        Connection C;
        C = (Connection)koneksi_database.configDB();
        
}
    
}
