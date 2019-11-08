package atividade4;

import java.util.Scanner;

public class Usuario {

    // método NÃO static
    // sem parâmetro e retorna um valor do tipo String
    String pedirNome() {
        // Instanciar objeto da classe Scanner para pedir entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Pedir nome e armazenar o valor digitado em uma variável local
        System.out.print("Digite o nome: ");
        String variavelLocal = scanner.nextLine();
        
        // Retornar o valor armazenado na variável local
        return variavelLocal;
    }
}
