package aula8_atividade3;

import java.util.Scanner;

public class Usuario {
    
    String email() {
        // Instanciar objeto da classe Scanner e guardar na variável "sc"
        Scanner sc = new Scanner(System.in);
        
        // Pedir o email
        System.out.print("Digite o email: ");
        String email = sc.nextLine();
        
        return email;
    }
    
    String nome() {
        // Instanciar objeto da classe Scanner e guardar na variável "sc"
        Scanner sc = new Scanner(System.in);
        
        // Pedir o nome
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        
        return nome;
    }
    
    String senha() {
        // Instanciar objeto da classe Scanner e guardar na variável "sc"
        Scanner sc = new Scanner(System.in);
        
        // Pedir a senha
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        
        return senha;
    }
}
