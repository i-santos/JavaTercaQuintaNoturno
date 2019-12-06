package listadetarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

    public static Usuario usuarioLogado = null;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Usuario> usuarios = new ArrayList();

        boolean rodando = true;
        while (rodando) {

            System.out.println("[1] Fazer Cadastro");
            System.out.println("[2] Fazer Login");
            System.out.println("[3] Sair");
            System.out.print("Digite a opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("==== CADASTRO ====");
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();

                    Usuario u = new Usuario();
                    ArrayList<Tarefa> tarefas = new ArrayList();
                    u.setEmail(email);
                    u.setSenha(senha);
                    u.setTarefas(tarefas);

                    usuarios.add(u);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                }
                case "2": {
                    System.out.println("==== LOGIN ====");
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();

                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemp = usuarios.get(i);

                        if (email.equals(uTemp.getEmail()) && senha.equals(uTemp.getSenha())) {
                            usuarioLogado = uTemp;
                            break;
                        }
                    }

                    if (usuarioLogado != null) {
                        // Login feito com sucesso
                        System.out.println("Login feito com sucesso");
                        homePage();
                    } else {
                        System.out.println("Email/senha inválidos.");
                    }

                    break;
                }
                case "3": {
                    rodando = false;
                    break;
                }
                default: {
                    break;
                }
            }

        }

    }

    public static void homePage() {

        boolean rodando = true;
        while (rodando) {

            System.out.println("[1] Listar Tarefas");
            System.out.println("[2] Listar Tarefas Finalizadas");
            System.out.println("[3] Listar Tarefas Não Finalizadas");
            System.out.println("[4] Adicionar Tarefa");
            System.out.println("[5] Finalizar Tarefa");
            System.out.println("[6] Remover Tarefa");
            System.out.println("[7] Logout");
            System.out.print("Digite a opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("=== TAREFAS ===");
                    ArrayList<Tarefa> tarefasTemp = usuarioLogado.getTarefas();

                    if (tarefasTemp.size() == 0) {
                        System.out.println("[Não há tarefas para mostrar]");
                    } else {

                        for (int i = 0; i < tarefasTemp.size(); i++) {
                            Tarefa tTemp = tarefasTemp.get(i);
                            System.out.println("Tarefa " + i);
                            System.out.println("\tTítulo: " + tTemp.getTitulo());
                            System.out.println("\tFinalizada: " + tTemp.isFinalizada());
                        }

                    }
                    break;
                }
                case "2": {
                    System.out.println("=== TAREFAS FINALIZADAS ===");
                    ArrayList<Tarefa> tarefasTemp = usuarioLogado.getTarefas();
                    ArrayList<Tarefa> finalizadas = new ArrayList();

                    for (int i = 0; i < tarefasTemp.size(); i++) {
                        Tarefa tTemp = tarefasTemp.get(i);

                        if (tTemp.isFinalizada()) {
                            finalizadas.add(tTemp);
                        }

                    }

                    if (finalizadas.isEmpty()) {
                        System.out.println("[Não há tarefas finalizadas]");
                    } else {

                        for (int i = 0; i < finalizadas.size(); i++) {
                            Tarefa tTemp = finalizadas.get(i);
                            System.out.println("Tarefa " + i);
                            System.out.println("\tTítulo: " + tTemp.getTitulo());
                            System.out.println("\tFinalizada: " + tTemp.isFinalizada());
                        }

                    }

                    break;
                }
                case "3": {
                    System.out.println("=== TAREFAS NÃO FINALIZADAS ===");
                    ArrayList<Tarefa> tarefasTemp = usuarioLogado.getTarefas();
                    ArrayList<Tarefa> naoFinalizadas = new ArrayList();

                    for (int i = 0; i < tarefasTemp.size(); i++) {
                        Tarefa tTemp = tarefasTemp.get(i);

                        if (!tTemp.isFinalizada()) {
                            naoFinalizadas.add(tTemp);
                        }

                    }

                    if (naoFinalizadas.isEmpty()) {
                        System.out.println("[Não há tarefas para mostrar]");
                    } else {

                        for (int i = 0; i < naoFinalizadas.size(); i++) {
                            Tarefa tTemp = naoFinalizadas.get(i);
                            System.out.println("Tarefa " + i);
                            System.out.println("\tTítulo: " + tTemp.getTitulo());
                            System.out.println("\tFinalizada: " + tTemp.isFinalizada());
                        }

                    }

                    break;
                }
                case "4": {
                    System.out.println("=== NOVA TAREFA ===");
                    System.out.print("Digite o título: ");
                    String titulo = scanner.nextLine();

                    Tarefa t = new Tarefa();
                    t.setTitulo(titulo);
                    t.setFinalizada(false);
                    usuarioLogado.getTarefas().add(t);
                    System.out.println("Tarefa adicionada com sucesso!");

                    break;
                }
                case "5": {
                    ArrayList<Tarefa> tarefasTemp = usuarioLogado.getTarefas();
                    ArrayList<Tarefa> naoFinalizadas = new ArrayList();

                    for (int i = 0; i < tarefasTemp.size(); i++) {
                        Tarefa tTemp = tarefasTemp.get(i);
                        if (!tTemp.isFinalizada()) {
                            naoFinalizadas.add(tTemp);
                        }
                    }

                    if (naoFinalizadas.isEmpty()) {
                        System.out.println("[Não há tarefas para finalizar]");
                    } else {

                        for (int i = 0; i < naoFinalizadas.size(); i++) {
                            Tarefa tTemp = naoFinalizadas.get(i);
                            System.out.println("[" + i + "] " + tTemp.getTitulo());
                        }
                        System.out.print("Digite a tarefa que deseja finalizar: ");
                        int posicao = scanner.nextInt();
                        scanner.nextLine(); // limpar buffer
                        naoFinalizadas.get(posicao).setFinalizada(true);
                        System.out.println("Tarefa finalizada com sucesso");
                    }

                    break;
                }
                case "6": {
                    ArrayList<Tarefa> tarefasTemp = usuarioLogado.getTarefas();
                    
                    if (tarefasTemp.isEmpty()) {
                        System.out.println("[Não há tarefas para remover]");
                    } else {
                        
                        for (int i = 0; i < tarefasTemp.size(); i++) {
                            Tarefa tTemp = tarefasTemp.get(i);
                            System.out.println("[" + i + "] " + tTemp.getTitulo());
                        }
                        
                        System.out.print("Digite a tarefa que deseja remover: ");
                        int posicao = scanner.nextInt();
                        scanner.nextLine(); // limpar buffer
                        tarefasTemp.remove(posicao);
                        System.out.println("Tarefa removida com sucesso!");
                        
                    }
                    break;
                }
                case "7": {
                    usuarioLogado = null;
                    rodando = false;
                    break;
                }
            }

        }

    }

}
