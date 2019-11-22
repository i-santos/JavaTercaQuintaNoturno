package teste;

import java.util.ArrayList;

public class DAO {

    public static Usuario usuarioLogado = null;
    private static ArrayList<Usuario> usuarios = new ArrayList();

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void adicionarUsuario(Usuario u) {

        usuarios.add(u);

    }

    public static boolean removerUsuario(String email) {

        boolean removido = false;

        Usuario u = procurarUsuarioPorEmail(email);

        if (u != null) {

            usuarios.remove(u);
            removido = true;

        }

        return removido;

    }

    public static void adicionarTarefaDoUsuario(Tarefa t) {
        usuarioLogado.getTarefas().add(t);
    }

    public static void mostrarTarefasDoUsuario() {

        for (int i = 0; i < usuarioLogado.getTarefas().size(); i++) {
            Tarefa t = usuarioLogado.getTarefas().get(i);
            System.out.println("Tarefa " + i);
            System.out.println("\tTítulo: " + t.getTitulo());
            System.out.println("\tFinalizada: " + t.isFinalizada());

        }

    }

    public static void mostrarTarefasNaoFinalizadasDoUsuario() {
        
        for (int i = 0; i < usuarioLogado.getTarefas().size(); i++) {
            Tarefa t = usuarioLogado.getTarefas().get(i);
            if (!t.isFinalizada()) {

                System.out.println("Tarefa " + i);
                System.out.println("\tTítulo: " + t.getTitulo());
                System.out.println("\tFinalizada: " + t.isFinalizada());
            }

        }

    }
    
    public static void finalizarTarefaDoUsuario(int id) {
        
        usuarioLogado.getTarefas().get(id).setFinalizada(true);
        
    }

    public static Usuario procurarUsuarioPorEmail(String email) {
        Usuario u = null;

        for (int i = 0; i < usuarios.size(); i++) {

            if (email.equals(usuarios.get(i).getEmail())) {
                u = usuarios.get(i);
                break;
            }

        }

        return u;

    }

}
