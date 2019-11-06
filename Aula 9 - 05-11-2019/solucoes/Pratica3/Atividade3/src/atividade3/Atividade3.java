package atividade3;

import java.util.Scanner;


public class Atividade3 {

    public static void main(String[] args) {

        // Instanciar o Scanner para pedir entrada de dados
        Scanner sc = new Scanner(System.in);
        
        // Pedir para digitar o nome e armazenar o valor digitar em uma variável
        //      local
        System.out.print("Digite o nome: ");
        String variavelLocal = sc.nextLine();
        
        // Instanciar objeto da classe Usuario
        Usuario u = new Usuario();
        
        // Usar objeto para chamar o método e passar o valor da variável local 
        //      como parâmetro
        u.mostrarMensagem(variavelLocal);

    }

}
