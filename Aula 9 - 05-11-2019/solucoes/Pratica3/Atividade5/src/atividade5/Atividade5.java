package atividade5;

import java.util.Scanner;


public class Atividade5 {

    public static void main(String[] args) {

        // Instanciar objeto da classe Scanner para pedir entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Pedir 2 valores int e armazenar em variáveis locais
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        
        // Instanciar objeto da classe Calculadora
        Calculadora c = new Calculadora();
        
        // Usar objeto c para chamar os métodos e apresentar o valor de retorno
        //  de cada um deles na tela
        System.out.println("Soma\t= " + c.soma(x, y));
        System.out.println("Sub\t= " + c.sub(x, y));
        System.out.println("Mult\t= " + c.mult(x, y));
        System.out.println("Div\t= " + c.div(x, y));
        

    }

}
