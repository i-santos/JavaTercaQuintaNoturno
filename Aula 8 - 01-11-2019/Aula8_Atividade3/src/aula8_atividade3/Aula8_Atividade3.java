package aula8_atividade3;

public class Aula8_Atividade3 {

    public static void main(String[] args) {
        // Instanciar objeto da classe Usuario e guardar na variável "u"
        Usuario u = new Usuario();

        // Pegar email
        String e = u.email();

        // Pegar nome
        String n = u.nome();

        // Pegar senha
        String s = u.senha();

        System.out.println("Email: " + e);
        System.out.println("Nome: " + n);
        System.out.println("Senha: " + s);
    }

}
