package atividade2;

import java.util.Scanner;

public class Usuario {

    // Declaração das variáveis de classe private e String
    private String email;
    private String nome;

    // Definição dos métodos
    void pedirEmail() {
        // Instanciar objeto da classe Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Pedir email e armazenar o valor digitado na variável de classe email
        System.out.print("Digite o email: ");
        email = scanner.nextLine();

    }

    void pedirNome() {
        // Instanciar objeto da classe Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Pedir email e armazenar o valor digitado na variável de classe email
        System.out.print("Digite o nome: ");
        nome = scanner.nextLine();

    }

    void mostrarEmail() {
        System.out.println("Email: " + email);
    }

    void mostrarNome() {
        System.out.println("Nome: " + nome);
    }

}
