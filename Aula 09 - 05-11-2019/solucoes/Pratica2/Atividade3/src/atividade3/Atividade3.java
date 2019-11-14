package atividade3;

import java.util.Scanner;


public class Atividade3 {

    public static void main(String[] args) {

        // Instanciar objeto da classe Scanner para pedir entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Pedir para digitar o nome e armazenar o valor numa variável local
        System.out.print("Digite o nome: ");
        String variavelLocal = scanner.nextLine();
        
        // chamar o método da classe Usuario e passar o valor que está guardado
        //      na variavelLocal como parâmetro
        Usuario.mostrarMensagem(variavelLocal);

    }

}
