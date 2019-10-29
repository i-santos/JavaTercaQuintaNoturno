/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import java.util.Scanner;

/**
 *
 * @author Professor
 */
public class Aula6Boolean {
    
    /**
     * Tipo de dado: boolean
     * 
     * O boolean é um tipo de dado que permite armazenar true ou false
     * 
     * true e false são VALORES.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Usuario u = new Usuario();
        
        System.out.print("Digite a senha: ");
        u.senha = scanner.nextLine();
        
        System.out.print("Repita a senha: ");
        u.confirmacaoSenha = scanner.nextLine();
        
        boolean b;
        
        // Atribuir o valor true para b
        b = true;
        // Atribuir o valor false para b
        b = false;
        
        // Avaliar a expressão lógica e armazenar o resultado em b
        b = 10 > 5; // b = true (o resultado da comparação 10 > 5 é true)
        b = 10 < 5; // b = false (o resultado de 10 < 5 é false)
        
        // Avaliar a expressão de igualdade e armazenar o resultado em b
        // O sinal "==" (DOIS iguais) representa IGUALDADE
        // O sinal "=" (UM igual apenas) representa ATRIBUIÇÃO
        b = 10 == 5; // false
        b = 10 == 10; // true
        
        // Avaliar a expressão usando o operador lógico "&&" (e lógico)
        b = 10 == 5 && 10 < 5; // 10 == 5 = false
                               // 10 < 5  = false
                               // Portanto, false && false = false
                               // b = false

        b = 10 == 10 && 10 < 5; // 10 == 10 = true
                                // 10 < 5   = false
                                // Portanto, true && false = false
                                // b = false
        
        b = 10 == 10 && 10 < 15; // 10 == 10 = true
                                 // 10 < 15  = true
                                 // Portanto, true && true = true
                                 // b = true
                               
        // Podemos também comparar os valores de VARIÁVEIS
        int n1 = 10;
        int n2 = 20;
        int n3 = 20;
        
        b = n1 < n2 && n1 < n3; // n1 -> 10, n2 -> 20, n3 -> 20
                                // 10 < 20 = true
                                // 10 < 20 = true
                                // Portanto, true && true = true
                                // b = true

        b = n1 > n2 || n1 < n3; // n1 -> 10, n2 -> 20, n3 -> 20
                                // 10 > 20 = false
                                // 10 < 20 = true
                                // Portanto, false || true = true
                                // b = true
        
        // Podemos comparar os valores de Strings?
        // Podemos! Como??
        b = u.senha == u.confirmacaoSenha;      // ERRADO: a comparação de Strings
                                                // com o "==" compara o ESPAÇO NA MEMÓRIA
                                                // Ou seja, compara se as "VAGAS" são iguais
                                    
        b = u.senha.equals(u.confirmacaoSenha); // CERTO: a comparação de Strings
                                                // com o .equals() compara o CONTEÚDO
        
        System.out.println("O valor de b = " + b);
        
    }
}
