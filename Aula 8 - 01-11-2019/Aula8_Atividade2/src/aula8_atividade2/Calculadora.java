/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8_atividade2;

/**
 *
 * @author Professor
 */
public class Calculadora {
    
    void soma(int x, int y) {
        int soma = x + y;
        System.out.println("Soma = " + soma);
    }
    
    void subtracao(int x, int y) {
        int sub = x - y;
        System.out.println("Sub = " + sub);
    }
    
    void multiplicacao(int x, int y) {
        int mult = x * y;
        System.out.println("Mult = " + mult);
    }
    
    void divisao(float x, float y) {
        float div = x / y;
        System.out.println("Div = " + div);
    }
    
}
