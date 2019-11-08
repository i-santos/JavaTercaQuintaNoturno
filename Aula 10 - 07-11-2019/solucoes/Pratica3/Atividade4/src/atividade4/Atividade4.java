package atividade4;

public class Atividade4 {

    public static void main(String[] args) {

        // Instanciar um objeto da classe Usuario
        Usuario u = new Usuario();

        // usar o objeto u para chamar o método e armazenar o valor retornado
        //  em uma variável local
        String variavelLocal = u.pedirNome();
        
        // Mostrar na tela o valor armazenado nessa variável local
        System.out.println(variavelLocal);
    }

}
