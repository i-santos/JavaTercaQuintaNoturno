package atividade1;

import java.util.Scanner;


public class Atividade1 {

    public static void main(String[] args) {

        // Instanciar objeto da classe Scanner para pedir entrada de dados
        Scanner sc = new Scanner(System.in);

        // Instanciar objeto da classe Usuario
        Usuario u = new Usuario();
        
        // Pedir email e nome e armazenar os valores digitados nas variáveis 
        //      de classe do objeto u
        System.out.print("Digite o email: ");
        u.email = sc.nextLine();
        System.out.print("Digite o nome: ");
        u.nome = sc.nextLine();
        
        // Mostrar os valores das variáveis de classe do objeto u
        System.out.println("Email: " + u.email);
        System.out.println("Nome: " + u.nome);
        
    }

}
