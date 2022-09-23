
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    
    
    public static Connection getConnection(){
        
        try{
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/alunostabel?user=root", "root", "24g11r84");
        }
        catch(SQLException excecao){
            throw new RuntimeException(excecao);
        }
    }
    
    public static void closeConnection(Connection con){
        
            
            try {
                if(con!=null){
                    con.close();
                    }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
    
    
    
        public static void closeConnection(Connection con, PreparedStatement stmt){
        
            closeConnection(con);
            
            try {
                
                if(stmt != null){
                    stmt.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
    
        
                public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
            closeConnection(con, stmt);
            
            try {
                
                if(rs != null){
                    rs.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
}
