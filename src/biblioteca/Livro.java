package biblioteca;

public class Livro {
    private int codigo;
    private String nome;
    private String editora;

    public Livro(int codigo, String nome, String editora) {
        this.codigo = codigo;
        this.nome = nome;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo = " + codigo +
                ", nome = " + nome + '\'' +
                ", editora = " + editora + '\'' +
                '}';
    }
}
