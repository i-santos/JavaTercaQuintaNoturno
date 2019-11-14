package aula8_atividade4;

import java.util.Scanner;

public class Aula8_Atividade4 {

    public static void main(String[] args) {
        // Instanciar objeto da classe Scanner e guardar na variável "sc"
        Scanner sc = new Scanner(System.in);
        
        // Pedir x e y
        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();
        
        // Instanciar objeto da classe Calculadora e guardar na variável "c"
        Calculadora c = new Calculadora();
        
        int soma = c.soma(x, y);
        int sub = c.subtracao(x, y);
        int mult = c.multiplicacao(x, y);
        float div = c.divisao(x, y);
        
        System.out.println("Soma = " + soma);
        System.out.println("Sub = " + sub);
        System.out.println("Mult = " + mult);
        System.out.println("Div = " + div);
        
    }
    
}
