package cadastrodeusuariosmysql;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeUsuariosMySQL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean rodando = true;

        while (rodando) {
            System.out.println("");
            System.out.println("[1] Cadastrar usuário");
            System.out.println("[2] Mostrar usuários cadastrados");
            System.out.println("[3] Procurar usuário por email");
            System.out.println("[4] Alterar usuário por email");
            System.out.println("[5] Remover usuário por email");
            System.out.println("[6] Sair");
            System.out.print("Digite a opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1": {

                    System.out.println("==== CADASTRO ====");
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();

                    Usuario u = new Usuario();
                    u.setEmail(email);
                    u.setSenha(senha);

                    boolean cadastrado = inserirUsuario(u);

                    if (cadastrado) {
                        System.out.println("Cadastro feito com sucesso!");
                    } else {
                        System.out.println("Erro ao cadastrar. Tente novamente");
                    }

                    break;
                }
                case "2": {
                    System.out.println("==== LISTAR USUÁRIOS CADASTRADOS ====");
                    ArrayList<Usuario> usuarios = buscarUsuarios();

                    for (Usuario u : usuarios) {
                        System.out.println("Usuário [id: " + u.getId() + "]");
                        System.out.println("\tEmail: " + u.getEmail());
                        System.out.println("\tSenha: " + u.getSenha());
                    }
                    break;
                }
                case "3": {
                    System.out.println("==== PROCURAR USUÁRIO ====");
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();

                    Usuario u = procurarUsuarioPorEmail(email);

                    if (u == null) {
                        System.out.println("E-mail não cadastrado");
                    } else {
                        System.out.println("Usuário [id: " + u.getId() + "]");
                        System.out.println("\tEmail: " + u.getEmail());
                        System.out.println("\tSenha: " + u.getSenha());
                    }
                    break;
                }
                case "4": {
                    System.out.println("==== ALTERAR ====");
                    System.out.print("Digite o email do usuário que deseja alterar: ");
                    String email = scanner.nextLine();
                    
                    Usuario u = procurarUsuarioPorEmail(email);
                    
                    if (u == null) {
                        System.out.println("E-mail não cadastrado");
                    } else {
                        
                        System.out.print("Digite o novo email: ");
                        String novoEmail = scanner.nextLine();
                        System.out.print("Digite a nova senha: ");
                        String novaSenha = scanner.nextLine();
                        
                        u.setEmail(novoEmail);
                        u.setSenha(novaSenha);
                        
                        boolean atualizado = alterarUsuario(u);
                        
                        if (atualizado) {
                            System.out.println("Dados alterados com sucesso!");
                        } else {
                            System.out.println("Erro ao alterar dados. Tente novamente");
                        }
                    }
                    break;
                }
                case "5": {
                    System.out.println("==== REMOVER USUÁRIO ====");
                    System.out.print("Digite o email do usuário que deseja remover: ");
                    String email = scanner.nextLine();
                    
                    Usuario u = procurarUsuarioPorEmail(email);
                    
                    if (u == null) {
                        System.out.println("E-mail não cadastrado");
                    } else {
                        boolean removido = removerUsuario(u);
                        
                        if (removido) {
                            System.out.println("Usuário removido com sucesso");
                        } else {
                            System.out.println("Erro ao remover usuário. Tente novamente");
                        }
                    }
                    break;
                }
                case "6": {
                    rodando = false;
                    break;
                }
            }

        }

    }

    public static boolean inserirUsuario(Usuario u) {
        boolean sucesso = false;

        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");

            PreparedStatement stmt = connection.prepareStatement("INSERT INTO cadastro_usuarios.usuario (email, senha) VALUES (?, ?)");

            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                sucesso = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sucesso;
    }

    public static ArrayList<Usuario> buscarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList();

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

                Usuario u = new Usuario();
                u.setId(id);
                u.setEmail(email);
                u.setSenha(senha);

                usuarios.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    public static Usuario procurarUsuarioPorEmail(String email) {
        Usuario u = null;

        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");

            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM cadastro_usuarios.usuario WHERE email = ?");

            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String senha = rs.getString("senha");

                u = new Usuario();
                u.setId(id);
                u.setEmail(email);
                u.setSenha(senha);
                break; // já encontramos, não precisa continuar procurando
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return u;
    }

    public static boolean alterarUsuario(Usuario u) {
        boolean sucesso = false;

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
                sucesso = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sucesso;
    }
    
    public static boolean removerUsuario(Usuario u) {
        boolean sucesso = false;
        
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM cadastro_usuarios.usuario WHERE id = ?");
            stmt.setInt(1, u.getId());
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0) {
                sucesso = true;
            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return sucesso;
    }
}
