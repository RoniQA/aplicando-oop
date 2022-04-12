package transporte;

public abstract class Transporte {
    protected String marca;
    protected String modelo;
    protected float quilometragem;
    protected double capacidadeTanque;

    public Transporte() {

    }

    public abstract void mover();
    public abstract void abastecer();
    public abstract void exibir();

    public Transporte(String marca, String modelo, float quilometragem, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

}



