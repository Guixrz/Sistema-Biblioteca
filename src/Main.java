import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Flamengo", LocalDate.of(1985, 11, 15), "Zico", "Uma vez flamengo, flamengo até morrer!");
        Livro livro2 = new Livro("Harry Potter", LocalDate.of(2001, 04, 27), "Fernanda", "Livro topp");

        Usuario usuario1 = new Usuario("Fernanda", LocalDate.of(2007, 04, 27), 2025003682, "fernanda.mb@discente.ufma.br");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarUsuario(usuario1);

        biblioteca.emprestarLivro("Flamengo");
        System.out.println(livro1.getDisponivel()); //false

        biblioteca.emprestarLivro("Flamengo"); //  O livro já está em uso.

        biblioteca.devolverLivro("Flamengo");
        System.out.println(livro1.getDisponivel()); //true

    }
}