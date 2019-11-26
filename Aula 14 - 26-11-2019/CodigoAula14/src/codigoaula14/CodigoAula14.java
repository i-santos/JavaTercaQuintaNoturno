package codigoaula14;

import java.util.ArrayList;


public class CodigoAula14 {

    public static void main(String[] args) {
        
        ArrayList<Usuario> usuarios = new ArrayList();
        
        String email = "igor@igor.com";
        String senha = "123";
        
        Tarefa t = new Tarefa();
        t.setFinalizada(false);
        t.setTitulo("Estudar");
        
        for(int i = 0; i < usuarios.size(); i++) {
            
            Usuario uTemp = usuarios.get(i);
            if (uTemp.getEmail().equals(email) 
                    && uTemp.getSenha().equals(senha)) {
                
                uTemp.getTarefas().add(t);
                
            }
        }

    }

}
