package atividade3;

import java.util.Scanner;


public class Atividade3 {

    public static void main(String[] args) {

        // Instanciar o Scanner para pedir entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Pedir para usuário digitar alguma mensagem e guardar em uma variável
        //  local
        System.out.print("Digite uma mensagem: ");
        String variavelLocal = scanner.nextLine();
        
        // chamar o método para mostrar o valor que está na variavelLocal
        // Portanto, passar o valor da variavelLocal por parâmetro
        mostrarMensagem(variavelLocal);
        
    }
    
    // método static que recebe um parâmetro do tipo String
    static void mostrarMensagem(String parametro) {
        // mostrar o valor passado por parâmetro
        System.out.println(parametro);
    }

}
