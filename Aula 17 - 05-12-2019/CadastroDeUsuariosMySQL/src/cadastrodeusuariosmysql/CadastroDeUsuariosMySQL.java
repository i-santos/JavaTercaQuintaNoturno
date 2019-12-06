package cadastrodeusuariosmysql;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class CadastroDeUsuariosMySQL {

    public static void main(String[] args) {

//        rodarInserirUsuario();
        rodarBuscarUsuarios();
    }
    
    public static void rodarInserirUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        
        Usuario u = new Usuario();
        u.setEmail(email);
        u.setSenha(senha);
        
        inserirUsuario(u);
    }
    public static void inserirUsuario(Usuario u) {
        try {
            
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "");
           
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO cadastro_usuarios.usuario (email, senha) VALUES (?, ?)");
            
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Usuário cadastrado com sucesso!");
            } else {
                System.out.println("Algo de errado não está certo. Tente novamente");
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void rodarBuscarUsuarios() {
        buscarUsuarios();
    }
    public static void buscarUsuarios() {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "");
            
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM cadastro_usuarios.usuario");
            
            ResultSet rs = stmt.executeQuery();
            
            while( rs.next() ) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                System.out.println("");
                System.out.println("Id: " + id);
                System.out.println("Email: " + email);
                System.out.println("Senha: " + senha);
            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
