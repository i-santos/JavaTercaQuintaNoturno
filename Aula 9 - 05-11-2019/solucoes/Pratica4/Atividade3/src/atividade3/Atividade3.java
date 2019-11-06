package atividade3;

import java.util.Scanner;


public class Atividade3 {

    public static void main(String[] args) {

        // Instanciar objeto da classe Scanner para pedir entrada de dados
        Scanner sc = new Scanner(System.in);
        
        // Pedir email e nome e armazenar os valores em variáveis locais
        System.out.print("Digite o email: ");
        String email = sc.nextLine();
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        // Instanciar objeto da classe Usuario
        Usuario u = new Usuario();
        
        // Usar objeto u para chamar o método atribuirEmail, passando o valor
        //  da variável local "email" como parâmetro
        u.atribuirEmail(email);
        
        // Usar objeto u para chamar o método atribuirNome, passando o valor
        //  da variável local "nome" como parâmetro
        u.atribuirNome(nome);
        
        // Usar objeto u para mostrar os valores das variáveis de classe através
        //  da chamada de método mostrarEmail e mostrarNome
        u.mostrarEmail();
        u.mostrarNome();
    }

}
