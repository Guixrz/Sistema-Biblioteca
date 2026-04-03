import java.util.ArrayList;

public class Biblioteca{
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca(){
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public Livro buscarLivro(String titulo){
        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }

    public Livro emprestarLivro(String titulo){
        Livro livro = this.buscarLivro(titulo);
            if(livro != null){
                if (livro.getDisponivel()){
                  livro.setDisponivel(false);
                }
                else{
                    System.out.println("O livro já está em uso.");
                }
                return livro;
            }
            return null;
    }

    public Livro devolverLivro(String titulo){
        Livro livro = this.buscarLivro(titulo);
        if(livro != null){
            if (livro.getDisponivel()){
                System.out.println("Livro não pode ser devolvido.");
            }
            else{
                livro.setDisponivel(true);
            }
            return livro;
        }
        return null;
    }
}


