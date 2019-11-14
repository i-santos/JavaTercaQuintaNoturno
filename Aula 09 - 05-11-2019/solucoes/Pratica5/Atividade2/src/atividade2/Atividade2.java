package atividade2;


public class Atividade2 {

    public static void main(String[] args) {

        // Instanciar objeto da classe Calculadora e guardar na variável calc
        Calculadora calc = new Calculadora();
        
        // Chamar os métodos do objeto calc (pedirX e pedirY)
        calc.pedirX();
        calc.pedirY();

        // Chamar os outros métodos do objeto calc
        calc.soma();
        calc.sub();
        calc.mult();
        calc.div();
    }

}
