package atividade1;

public class Calculadora {
    
    float x;
    float y;
    
    // Métodos NÃO static
    // sem parâmetros
    // retorno void
    void soma() {
        System.out.println("Soma\t= " + (x + y));
    }
    
    // sem parâmetros
    // retorno void
    void sub() {
        System.out.println("Sub\t= " + (x - y));
    }
    
    // sem parâmetros
    // retorno void
    void mult() {
        System.out.println("Mult\t= " + (x * y));
    }
    
    // sem parâmetros
    // retorno void
    void div() {
        System.out.println("Div\t= " + (x / y));
    }

}
