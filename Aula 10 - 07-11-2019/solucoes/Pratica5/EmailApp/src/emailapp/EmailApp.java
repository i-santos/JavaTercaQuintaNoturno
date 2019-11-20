package emailapp;

import java.util.ArrayList;
import java.util.Scanner;


public class EmailApp {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Email> emails = new ArrayList();

        
        Email emailModel = new Email();
        emailModel.setRemetente("igor@igor.com");
        emailModel.setDestinario("teste@teste.com");
        emailModel.setAssunto("Java");
        emailModel.setCorpo("Estudar java");
        
        Email emailModel2 = new Email();
        emailModel.setRemetente("java@java.com");
        emailModel.setDestinario("teste@teste.com");
        emailModel.setAssunto("Eibneti");
        emailModel.setCorpo("Ir para a aula hoje");
        
        Email emailModel3 = new Email();
        emailModel.setRemetente("abc@abc.com");
        emailModel.setDestinario("teste@teste.com");
        emailModel.setAssunto("Tal tal tal");
        emailModel.setCorpo("Qualquier coisa");
        
        
        System.out.println("De: " + emailModel.getRemetente());
        System.out.println("Para: " + emailModel.getDestinario());
        System.out.println("Ass.: " + emailModel.getAssunto());
        System.out.println(emailModel.getAssunto());
        
        
        

    }

}
