
package connection;

import static connection.ConnectionFactory.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;


public class PesqAluno {
    
        public PesqAluno() throws Exception{
        
    }
    
    public Vector Pesquisar(String pesq) throws Exception{
        Vector tb = new Vector ();
        String url = "select * from alunos where nome like '" + pesq + "%'";
        PreparedStatement stmt = getConnection().prepareStatement(url);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Vector nl = new Vector();
            nl.add(rs.getInt("Id"));
            nl.add(rs.getString("nome"));
            nl.add(rs.getString("data"));
            nl.add(rs.getString("cpf"));
            tb.add(nl);
        }
        return tb;
    }
    
    
}
