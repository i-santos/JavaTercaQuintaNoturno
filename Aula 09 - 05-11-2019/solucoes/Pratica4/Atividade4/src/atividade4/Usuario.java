package atividade4;

public class Usuario {

    // Declaração de variáveis de classe
    private String email;
    private String nome;
    
    // Definição dos métodos
    
    void atribuirEmail(String parametro) {
        email = parametro;
    }
    
    void atribuirNome(String parametro) {
        nome = parametro;
    }
    
    String pegarEmail() {
        return email;
    }
    
    String pegarNome() {
        return nome;
    }
}
