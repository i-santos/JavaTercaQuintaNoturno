package atividade5;

import java.util.Scanner;


public class Atividade5 {

    public static void main(String[] args) {

        // Instanciar objeto da classe Scanner para pedir entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Pedir 2 valores int e armazenar nas variáveis locais x e y
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        
        // Chamar os métodos da classe Calculadora e apresentar o valor retornado
        //  por cada um deles
        // Passar os valores de x e y como parâmetros
        System.out.println("Soma\t= " + Calculadora.soma(x, y));
        System.out.println("Sub\t= " + Calculadora.sub(x, y));
        System.out.println("Mult\t= " + Calculadora.mult(x, y));
        System.out.println("Div\t= " + Calculadora.div(x, y));
    }

}
