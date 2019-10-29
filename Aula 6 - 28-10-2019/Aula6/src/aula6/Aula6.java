package aula6;

import java.util.Scanner;

public class Aula6 {

    /**
     * Instanciar 3 objetos da classe Usuario.
     *
     * Pedir o email, a senha e o nome de cada um dos 3 usuários.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciar os 3 objetos da classe Usuario
        // A instanciação acontece com o "new Usuario()"
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();
        Usuario u3 = new Usuario();
        
        boolean compararSenhas;

        // Entrada de dados: pedir email, senha e nome para cada um dos objetos
        System.out.print("Digite o email do u1: ");
        u1.email = sc.nextLine();

        System.out.print("Digite a senha do u1: ");
        u1.senha = sc.nextLine();
        System.out.print("Repita a senha do u1: ");
        u1.confirmacaoSenha = sc.nextLine();
        
        System.out.print("Digite o nome do u1: ");
        u1.nome = sc.nextLine();

        System.out.print("Digite o email do u2: ");
        u2.email = sc.nextLine();

        System.out.print("Digite a senha do u2: ");
        u2.senha = sc.nextLine();
        System.out.print("Repita a senha do u2: ");
        u2.confirmacaoSenha = sc.nextLine();
        
        System.out.print("Digite o nome do u2: ");
        u2.nome = sc.nextLine();

        System.out.print("Digite o email do u3: ");
        u3.email = sc.nextLine();

        System.out.print("Digite a senha do u3: ");
        u3.senha = sc.nextLine();
        System.out.print("Repita a senha do u3: ");
        u3.confirmacaoSenha = sc.nextLine();
        
        System.out.print("Digite o nome do u3: ");
        u3.nome = sc.nextLine();

        // Saída de Dados: apresentar os dados de cada um dos objetos
        System.out.println("O email do u1 é: " + u1.email);
        System.out.println("A senha do u1 é: " + u1.senha);
        System.out.println("O nome do u1 é: " + u1.nome);
        compararSenhas = u1.senha.equals(u1.confirmacaoSenha);
        System.out.println("As senhas do u1 conferem? " + compararSenhas);
        
        System.out.println("O email do u2 é: " + u2.email);
        System.out.println("A senha do u2 é: " + u2.senha);
        System.out.println("O nome do u2 é: " + u2.nome);
        compararSenhas = u2.senha.equals(u2.confirmacaoSenha);
        System.out.println("As senhas do u2 conferem? " + compararSenhas);
        
        System.out.println("O email do u3 é: " + u3.email);
        System.out.println("A senha do u3 é: " + u3.senha);
        System.out.println("O nome do u3 é: " + u3.nome);
        compararSenhas = u3.senha.equals(u3.confirmacaoSenha);
        System.out.println("As senhas do u3 conferem? " + compararSenhas);

        
        // Comparação entre u1 e u2
        boolean igual = u1.nome.equals(u2.nome) 
                && u1.email.equals(u2.email)
                && u1.senha.equals(u2.senha) 
                && u1.confirmacaoSenha.equals(u2.confirmacaoSenha);
    }
    

}
