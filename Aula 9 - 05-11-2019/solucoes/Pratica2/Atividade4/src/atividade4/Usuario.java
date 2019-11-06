package atividade4;

import java.util.Scanner;

public class Usuario {

    // método static sem parâmetros e que retorna um valor do tipo String
    static String pedirNome() {
        
        // Instanciar objeto da classe Scanner para pedir entrada de dados
        Scanner sc = new Scanner(System.in);
        
        // Pedir para digitar o nome e armazenar o valor em uma variável local
        System.out.print("Digite o nome: ");
        String variavelLocal = sc.nextLine();
        
        // Retornar o valor que foi armazenado na variável local
        return variavelLocal;
    }
}
