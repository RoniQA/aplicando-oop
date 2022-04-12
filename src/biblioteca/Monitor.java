package biblioteca;

public class Monitor extends Usuario{
    private double bolsaDeEstudos;


    public Monitor(String nome, long cpf, int codigo) {
        super(nome, cpf, codigo);
        this.bolsaDeEstudos = bolsaDeEstudos;
    }

    @Override
    public double alugarLivro(int diasAlugado) {
        int diasExcedidos;
        diasExcedidos = diasAlugado - 30;
        if (diasExcedidos <= 0 ){
            multa = 0;
        } else if (diasExcedidos > 0) {
            multa = diasExcedidos * 1;
        }
        return this.multa;
    }

    public double getBolsaDeEstudos() {
        return bolsaDeEstudos;
    }

    public void setBolsaDeEstudos(double bolsaDeEstudos) {
        this.bolsaDeEstudos = bolsaDeEstudos;
    }
}
