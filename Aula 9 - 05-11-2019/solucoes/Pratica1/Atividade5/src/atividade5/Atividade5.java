package atividade5;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        // Instanciar objeto da classe Scanner para pedir entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Pedir valores do tipo int e armazenar nas variáveis locais x e y
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        
        // fazer a chamada dos métodos static e apresentar os valores retornados
        System.out.println("Soma\t= " + soma(x, y));
        System.out.println("Sub\t= " + sub(x, y));
        System.out.println("Mult\t= " + mult(x, y));
        System.out.println("Div\t= " + div(x, y));
        

    }

    // Definir os métodos static
    // recebe 2 parâmetros do tipo int e retorna um valor do tipo int
    static int soma(int x, int y) {
        return x + y;
    }

    // recebe 2 parâmetros do tipo int e retorna um valor do tipo int
    static int sub(int x, int y) {
        return x - y;
    }

    // recebe 2 parâmetros do tipo int e retorna um valor do tipo int
    static int mult(int x, int y) {
        return x * y;
    }

    // recebe 2 parâmetros do tipo int e retorna um valor do tipo int
    static int div(int x, int y) {
        return x / y;
    }

}
