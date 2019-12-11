package crud_usuarios_mysql;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUD_Usuarios_MySQL {

    public static void main(String[] args) {
        // Teste: OK
//        testarInserirUsuario();

        // Teste: OK
//        testarBuscarUsuarios();

        // Teste: OK
//        testarAtualizarUsuario();

        // Teste: 
//        testarDeletarUsuario();
    }

    public static void testarInserirUsuario() {
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

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");

            PreparedStatement stmt = connection.prepareStatement("INSERT INTO cadastro_usuarios.usuario (email, senha) VALUES (?, ?)");
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Usuário cadastrado com sucesso");
            } else {
                System.out.println("Usuário cadastrado com sucesso");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testarBuscarUsuarios() {
        buscarUsuarios();
    }

    public static void buscarUsuarios() {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");

            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM cadastro_usuarios.usuario");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String senha = rs.getString("senha");

                System.out.println("");
                System.out.println("Usuário [id: " + id + "]");
                System.out.println("\tEmail: " + email);
                System.out.println("\tSenha: " + senha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testarAtualizarUsuario() {
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar todos usuários primeiro
        buscarUsuarios();
        
        System.out.print("Digite o id do usuário que deseja alterar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o novo email: ");
        String email = scanner.nextLine();
        System.out.print("Digite a nova senha: ");
        String senha = scanner.nextLine();

        Usuario u = new Usuario();
        u.setId(id);
        u.setEmail(email);
        u.setSenha(senha);

        atualizarUsuario(u);
    }

    public static void atualizarUsuario(Usuario u) {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");

            PreparedStatement stmt = connection.prepareStatement("UPDATE cadastro_usuarios.usuario SET email = ?, senha = ? WHERE id = ?");

            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            stmt.setInt(3, u.getId());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Dados atualizados com sucesso!");
            } else {
                System.out.println("Algo deu errado ao atualizar os dados. Tente novamente");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testarDeletarUsuario() {
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar todos usuários primeiro
        buscarUsuarios();
        
        System.out.print("Digite o id do usuário que deseja remover: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // limpar buffer
        
        Usuario u = new Usuario();
        u.setId(id);
        
        deletarUsuario(u);
    }

    public static void deletarUsuario(Usuario u) {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");

            PreparedStatement stmt = connection.prepareStatement("DELETE FROM cadastro_usuarios.usuario WHERE id = ?");
            stmt.setInt(1, u.getId());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Usuário removido com sucesso!");
            } else {
                System.out.println("Não foi possível remover usuário. Tente novamente");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
