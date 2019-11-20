package registroproduto;

import java.util.ArrayList;
import java.util.Scanner;


public class RegistroProduto {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList();
        
        Produto p = new Produto();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        
        System.out.print("Digite a quantidade em estoque: ");
        int estoque = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite o preço do produto: ");
        float preco = scanner.nextFloat();
        scanner.nextLine();
        
        p.setNome(nome);
        p.setCodigo(codigo);
        p.setEstoque(estoque);
        p.setPreco(preco);
        
        produtos.add(p);
        
        Produto p2 = new Produto();
        System.out.print("Digite o nome do produto: ");
        nome = scanner.nextLine();
        
        System.out.print("Digite o código do produto: ");
        codigo = scanner.nextLine();
        
        System.out.print("Digite a quantidade em estoque: ");
        estoque = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite o preço do produto: ");
        preco = scanner.nextFloat();
        scanner.nextLine();
        
        p2.setNome(nome);
        p2.setCodigo(codigo);
        p2.setEstoque(estoque);
        p2.setPreco(preco);
        
        produtos.add(p2);
        
        System.out.println("Produto 1:");
        System.out.println("Nome: " + produtos.get(0).getNome());
        System.out.println("Código: " + produtos.get(0).getCodigo());
        System.out.println("Estoque: " + produtos.get(0).getEstoque());
        System.out.println("Preço: " + produtos.get(0).getPreco());
        
        System.out.println("");
        System.out.println("Produto 2:");
        System.out.println("Nome: " + produtos.get(1).getNome());
        System.out.println("Código: " + produtos.get(1).getCodigo());
        System.out.println("Estoque: " + produtos.get(1).getEstoque());
        System.out.println("Preço: " + produtos.get(1).getPreco());
        

    }

}
