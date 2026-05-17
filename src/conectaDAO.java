import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/uc11?useSSL=false";
            String usuario = "estudante";
            String senha = "1234";
            
            conn = DriverManager.getConnection(url, usuario, senha);
            
        } catch (ClassNotFoundException e) {

            JOptionPane.showMessageDialog(null, "Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
          
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco: " + e.getMessage());
        }
        
        return conn;
    }
}
