/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Professor
 */
public class GoogleChrome {
    
    static void request() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o email: ");
        String email = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        
        try {
            // Criar a URL para onde enviaremos a requisição
            // A porta precisa ser a mesma que o Tomcat estiver rodando
            URL url = new URL("http://localhost:8084/Aula05Web/LoginServlet");
            
            // Criar a conexão do meu programa com o Tomcat
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            // Configurar a conexão
            
            // Configurar o método do HTTP: vamos usar o POST
            conexao.setRequestMethod("POST");
            // Sinalizar que nossa conexão enviará dados de saída
            conexao.setDoOutput(true);
            // Configurar o tipo de conteúdo que enviaremos
            conexao.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            
            // Pegar o ESCRITOR de saída de dados
            // OutputStreamWriter, traduzindo = Escritor de Fluxo de Saída.
            // Ou seja, é o responsável por gerar o fluxo de saída
            OutputStreamWriter writer = new OutputStreamWriter(conexao.getOutputStream());
            
            // Enviar os dados: o conjunto de pares chave/valor. No caso, email
            //  e senha do usuário
            writer.write("email=" + email + "&senha=" + senha);
            
            // Sinalizar que terminamos de enviar os dados
            writer.close();
            
            // Agora precisamos aguardar a resposta do Tomcat
            
            // Para isso, vamos pegar um LEITOR de fluxo de dados de ENTRADA
            // InputStreamReader, traduzindo: Leitor de Fluxo de Entrada
            InputStreamReader reader = new InputStreamReader(conexao.getInputStream());
            // Precisamos criar um BUFFER de leitura
            BufferedReader buffer = new BufferedReader(reader);
            // Criar uma variável para construir a resposta que vem do Tomcat
            // StringBuilder, traduzindo: Construtor de String
            StringBuilder response = new StringBuilder();
            // Criar uma variável para armazenar os dados que são lidos do buffer
            String line;
            
            // Enquanto os dados que chegarem forem válidos, adicionar na String
            //  de resposta
            while((line = buffer.readLine()) != null) {
                response.append(line);
                // Pular linha no final
                response.append("\n");
            }
            
            // Apresentar a resposta completa
            System.out.println(response);
            
        } catch(IOException e){
            
        }
    }
}
