package transporte;

public class Aviao extends Transporte{
    private String codigo;


    public Aviao(String marca, String modelo, float quilometragem, double capacidadeTanque) {
        super(marca, modelo, quilometragem, capacidadeTanque);
    }

    public Aviao() {

    }


    @Override
    public void mover() {
        quilometragem = quilometragem + 1;
        capacidadeTanque = capacidadeTanque - 10;
    }

    @Override
    public void abastecer() {
        capacidadeTanque = capacidadeTanque + 10;
    }

    @Override
    public void exibir() {

    }

    public Aviao(String marca, String modelo, float quilometragem, double capacidadeTanque, String codigo) {
        super(marca, modelo, quilometragem, capacidadeTanque);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "codigo='" + codigo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", quilometragem=" + quilometragem +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }
}
