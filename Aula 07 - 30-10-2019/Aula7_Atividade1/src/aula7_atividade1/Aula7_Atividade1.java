package aula7_atividade1;

import java.util.Scanner;

/**
 * Pedir para o usuário digitar o nome na main
 * 
 * Mostrar o nome em um método da classe Usuario
 * 
 * @author Professor
 */
public class Aula7_Atividade1 {

    public static void main(String[] args) {
        
        // Instanciar objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Pedir para digitar nome
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        // Chamar o método da classe Usuario para mostrar o nome
        // Para isso, precisa instanciar um objeto da classe Usuario
        Usuario u = new Usuario();
        
        // Chamar o método e passar o valor da variável "nome" como parâmetro
        u.mostrarNome(nome);
    }
    
}
