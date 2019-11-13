package atividade1;

import java.util.Scanner;


public class Atividade1 {

    public static void main(String[] args) {

        // Instanciar objeto da classe Scanner e armazenar na variável sc
        Scanner sc = new Scanner(System.in);
        
        // Instanciar objeto da classe Calculadora e armazenar na variável calc
        Calculadora calc = new Calculadora();
        
        // Pedir valores e armazenar nas variáveis de classe x e y
        System.out.print("Digite o valor de x: ");
        // guardar o valor na variável de classe x do objeto calc
        calc.x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        // guardar o valor na variável de classe y do objeto calc
        calc.y = sc.nextInt();
        
        // Chamar os métodos do objeto calc
        calc.soma();
        calc.sub();
        calc.mult();
        calc.div();
        
    }

}
