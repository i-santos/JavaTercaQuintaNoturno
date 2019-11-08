package atividade3;

public class Usuario {
    
    // Declaração de variáveis de classe private e tipo String
    private String email;
    private String nome;
    
    // Definição dos métodos
    
    // um valor do tipo String como parâmetro
    // retorno void
    void atribuirEmail(String parametro) {
        email = parametro;
    }
    
    // um valor do tipo String como parâmetro
    // retorno void
    void atribuirNome(String parametro) {
        nome = parametro;
    }
    
    // sem parâmetros
    // retorno void
    void mostrarEmail() {
        System.out.println("Email: " + email);
    }
    
    // sem parâmetros
    // retorno void
    void mostrarNome() {
        System.out.println("Nome: " + nome);
    }
    
    

}
