package aula7;

import java.util.Scanner;

public class Aula7 {

    /**
     * Aula sobre parâmetros
     * 
     * Parâmetros são passados na CHAMADA de um método.
     * 
     * Os parâmetros servem para transferir valores de um ESCOPO para outro.
     * 
     * Os métodos DEFINEM quais parâmetros eles precisam
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        // Pedir para o usuário digitar valores de x e y
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        
        // Chamar o método soma e PASSAR x e y como PARÂMETROS  
        soma(x, y);
    }
    
    // O método soma EXIGE dois parâmetros:
    //      - int n1 -> é o primeiro parâmetro
    //      - int n2 -> é o segundo parâmetro
    static void soma(int n1, int n2) {
        System.out.println("Soma = " + (n1 + n2));
    }
}
