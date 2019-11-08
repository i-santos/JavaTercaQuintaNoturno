package atividade4;

import java.util.Scanner;


public class Atividade4 {

    public static void main(String[] args) {

        // Criar uma variável local e armazenar o valor de retorno do método
        String variavelLocal = pedirMensagem();
        
        // Mostrar o valor retornado pelo método
        System.out.println(variavelLocal);

    }
    
    // método static sem parâmetros que retorna um valor do tipo String
    static String pedirMensagem() {
        // Instanciar o Scanner para pedir entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Pedir para usuário digitar mensagem e armazenar em uma variável local
        System.out.print("Digite uma mensagem: ");
        String mensagem = scanner.nextLine();
        
        // retornar o valor armazenado na variável local "mensagem"
        return mensagem;
    }

}
