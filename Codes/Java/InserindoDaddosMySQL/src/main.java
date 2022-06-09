import Classes.ConnectionFatory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class main {

    public static void main(String[] args) {
        Connection con = ConnectionFatory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "insert into usuario(user, pass) values('Maria','123')";
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate(); 
        }catch(SQLException ex){
            System.out.println("Erro ao salvar os dados");
        }finally{
            ConnectionFatory.closeConnection(con,stmt);
        }
        
    }
    
}