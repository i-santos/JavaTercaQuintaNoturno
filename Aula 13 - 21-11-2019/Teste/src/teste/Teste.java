package teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Usuario> usuarios = new ArrayList();
        ArrayList<Tarefa> tarefas = new ArrayList();
        boolean continuar = true;
        
        while(continuar) {
            System.out.println("[1] Adicionar Usuario");
            System.out.println("[2] Adicionar Tarefa");
            System.out.println("[3] Mostrar usuários cadastrados");
            System.out.println("[4] Mostrar tarefas cadastradas");
            System.out.println("[5] Finalizar uma tarefa");
            System.out.println("[6] Remover um usuário");
            System.out.println("[7] Remover uma tarefa");
            System.out.println("[8] Sair");
            System.out.print("Digite a opção: ");
            String opcao = scanner.nextLine();
            
            switch(opcao) {
                
                case "1": {
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();
                    
                    Usuario u = new Usuario();
                    u.setEmail(email);
                    u.setSenha(senha);
                    
                    usuarios.add(u);
                    
                    break;
                }
                case "2": {
                    System.out.print("Digite o título: ");
                    String titulo = scanner.nextLine();
                    
                    Tarefa t = new Tarefa();
                    t.setTitulo(titulo);
                    t.setFinalizada(false);
                    
                    tarefas.add(t);
                    break;
                }
                case "3": {
                    
                    for(int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemp = usuarios.get(i);
                        System.out.println("Usuário " + i);
                        System.out.println("Email: " + uTemp.getEmail());
                        System.out.println("Senha: " + uTemp.getSenha());
                        System.out.println("");
                    }
                    
                    break;
                }
                case "4": {
                    for(int i = 0; i < tarefas.size(); i++) {
                        Tarefa tTemp = tarefas.get(i);
                        System.out.println("Tarefa " + i);
                        System.out.println("Título: " + tTemp.getTitulo());
                        System.out.println("Finalizada: " + tTemp.isFinalizada());
                        System.out.println("");
                    }
                    break;
                }
                case "5": {
                    System.out.println("");
                    for(int i = 0; i < tarefas.size(); i++) {
                        Tarefa tTemp = tarefas.get(i);
                        System.out.println("Tarefa " + i);
                        System.out.println("Título: " + tTemp.getTitulo());
                        System.out.println("Finalizada: " + tTemp.isFinalizada());
                        System.out.println("");
                    }
                    System.out.println("");
                    System.out.print("Digite a tarefa que deseja finalizar: ");
                    int referencia = scanner.nextInt();
                    scanner.nextLine();
                    
                    Tarefa tTemp = tarefas.get(referencia);
                    tTemp.setFinalizada(true);
                    
                    break;
                }
                case "6": {
                    System.out.println("");
                    for(int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemp = usuarios.get(i);
                        System.out.println("Usuário " + i);
                        System.out.println("Email: " + uTemp.getEmail());
                        System.out.println("Senha: " + uTemp.getSenha());
                        System.out.println("");
                    }
                    System.out.print("Digite o usuário que deseja remover: ");
                    int referencia = scanner.nextInt();
                    scanner.nextLine();
                    
                    usuarios.remove(referencia);
                    
                    break;
                }
                case "7": {
                    System.out.println("");
                    for(int i = 0; i < tarefas.size(); i++) {
                        Tarefa tTemp = tarefas.get(i);
                        System.out.println("Tarefa " + i);
                        System.out.println("Título: " + tTemp.getTitulo());
                        System.out.println("Finalizada: " + tTemp.isFinalizada());
                        System.out.println("");
                    }
                    System.out.println("");
                    System.out.print("Digite a tarefa que deseja finalizar: ");
                    int referencia = scanner.nextInt();
                    scanner.nextLine();
                    
                    tarefas.remove(referencia);
                    
                    break;
                }
                case "8": {
                    continuar = false;
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        }
        
    }

}
