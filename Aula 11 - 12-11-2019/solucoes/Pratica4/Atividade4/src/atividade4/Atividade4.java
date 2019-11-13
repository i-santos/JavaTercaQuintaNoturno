package atividade4;

import java.util.Scanner;


public class Atividade4 {

    public static void main(String[] args) {

        // Instanciar scanner
        Scanner scanner = new Scanner(System.in);
        
        // Pedir email e nome e armazenar em variáveis locais
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        // Instanciar objeto da classe Usuario
        Usuario u = new Usuario();
        
        // Atribuir valores para as variáveis de classe por chamada de método, 
        //  passando os valores como parâmetro
        u.atribuirEmail(email);
        u.atribuirNome(nome);
        
        // Mostrar os valores das variáveis de classe
        System.out.println("Email: " + u.pegarEmail());
        System.out.println("Nome: " + u.pegarNome());
    }

}
