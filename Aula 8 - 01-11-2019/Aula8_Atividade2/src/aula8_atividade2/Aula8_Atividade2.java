package aula8_atividade2;

import java.util.Scanner;

public class Aula8_Atividade2 {

    public static void main(String[] args) {
        // Instanciar objeto da classe Scanner e guardar na variável "scanner"
        Scanner scanner = new Scanner(System.in);
        
        // Declarar variáveis LOCAIS x e y
        int x;
        int y;
        
        // Entrada de dados
        // pegar o valor x
        System.out.print("Digite o valor de x: ");
        x = scanner.nextInt();
        // pegar o valor de y
        System.out.print("Digite o valor de y: ");
        y = scanner.nextInt();
        
        // Instanciar objeto da classe Calculadora e guardar na variável "c"
        Calculadora c = new Calculadora();
        c.soma(x, y);
        c.subtracao(x, y);
        c.multiplicacao(x, y);
        c.divisao(x, y);
        
    }
    
    
}
