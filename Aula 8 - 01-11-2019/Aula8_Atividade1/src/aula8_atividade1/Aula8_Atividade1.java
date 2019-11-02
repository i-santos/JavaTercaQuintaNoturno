package aula8_atividade1;

import java.util.Scanner;

public class Aula8_Atividade1 {

    public static void main(String[] args) {
        // Instanciar scanner
        Scanner sc = new Scanner(System.in);
        
        // Mostrar mensagem pedindo entrada
        System.out.print("Digite o nome: ");
        // pegar entrada
        String nome = sc.nextLine();
        
        // Instanciar usuario
        Usuario u = new Usuario();
        
        // CHAMAR o método e PASSAR COMO PARÂMETRO o valor de nome
        u.mostrarNome(nome);
        
    }
    
}
