package atividade2;

import java.util.Scanner;

public class Calculadora {

    // Variáveis de classe
    // tipo     : float
    // acesso   : private
    private float x;
    private float y;
    
    // Métodos NÃO static
    
    // sem parâmetros e retorno void
    void pedirX() {
        // Instanciar objeto da classe Scanner e guardar na variável sc
        Scanner sc = new Scanner(System.in);
        
        // Pedir para digitar um valor e armazenar na variável de classe x
        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();
    }
    
    // sem parâmetros e retorno void
    void pedirY() {
        // Instanciar objeto da classe Scanner e guardar na variável sc
        Scanner sc = new Scanner(System.in);
        
        // Pedir para digitar um valor e armazenar na variável de classe x
        System.out.print("Digite o valor de y: ");
        y = sc.nextInt();
    }
    
    // sem parâmetros e retorno void
    void soma() {
        System.out.println("Soma\t = " + (x + y));
    }
    
    // sem parâmetros e retorno void
    void sub() {
        System.out.println("Sub\t = " + (x - y));
    }
    
    // sem parâmetros e retorno void
    void mult() {
        System.out.println("Mult\t = " + (x * y));
    }
    
    // sem parâmetros e retorno void
    void div() {
        System.out.println("Div\t = " + (x / y));
    }
}
