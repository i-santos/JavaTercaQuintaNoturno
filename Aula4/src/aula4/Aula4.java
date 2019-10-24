/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.Scanner;

/**
 *
 * @author Professor
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Calculadora.x = sc.nextInt();
        Calculadora.y = sc.nextInt();
        
        System.out.println("Soma: " + Calculadora.soma());
        System.out.println("Subtração: " + Calculadora.subtracao());
        System.out.println("Multiplicação: " + Calculadora.multiplicacao());
        System.out.println("Divisão: " + Calculadora.divisao());
        
    }
    
}
