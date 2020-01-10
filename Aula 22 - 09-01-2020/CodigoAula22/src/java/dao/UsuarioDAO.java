package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

public class UsuarioDAO {
    
    public static boolean inserirUsuario(Usuario u) {
        boolean sucesso = false;
        
        try (Connection connection = Conexao.abrirConexao()) {
            
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO cadastro_usuarios.usuario (email, senha) VALUES (?, ?)");
            
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0) {
                sucesso = true;
            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return sucesso;
    }
    
    public static ArrayList<Usuario> buscarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList();
        
        try (Connection c = Conexao.abrirConexao()) {
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM cadastro_usuarios.usuario");
            
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
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return usuarios;
    }
    
    public static Usuario buscarUsuarioPorEmail(String email) {
        Usuario u = null;
        
        try (Connection c = Conexao.abrirConexao()) {
            
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM cadastro_usuarios.usuario WHERE email = ?");
            
            stmt.setString(1, email);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                int id = rs.getInt("id");
                String senha = rs.getString("senha");
                
                u = new Usuario();
                
                u.setId(id);
                u.setEmail(email);
                u.setSenha(senha);
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return u;
    }

    public static boolean atualizarUsuario(Usuario u) {
        
        boolean sucesso = false;
        
        try (Connection c = Conexao.abrirConexao()) {
            
            PreparedStatement stmt = c.prepareStatement("UPDATE cadastro_usuarios.usuario SET email = ?, senha = ? WHERE id = ?");
            
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            stmt.setInt(3, u.getId());
            
            int rowsAffected = stmt.executeUpdate();
            
            if (rowsAffected > 0) {
                sucesso = true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return sucesso;
    }
    
    public static boolean removerUsuario(Usuario u) {
        boolean sucesso = false;
        
        try (Connection c = Conexao.abrirConexao()) {
            
            PreparedStatement stmt = c.prepareStatement("DELETE FROM cadastro_usuarios.usuario WHERE id = ?");
            
            stmt.setInt(1, u.getId());
            
            int rowsAffected = stmt.executeUpdate();
            
            sucesso = rowsAffected > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return sucesso;
    }
}
