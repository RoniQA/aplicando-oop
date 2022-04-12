package biblioteca;

public class Usuario {
    private String nome;
    private long cpf;
    private int codigo;
    protected double multa;

    public Usuario(String nome, long cpf, int codigo) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
    }

    public double alugarLivro (int diasAlugado){
        int diasExcedidos;
        diasExcedidos = diasAlugado - 15;
        if (diasExcedidos <= 0 ){
            multa = 0;
        }else if(diasExcedidos > 0){
            multa = diasExcedidos * 1;
        }
        return this.multa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}