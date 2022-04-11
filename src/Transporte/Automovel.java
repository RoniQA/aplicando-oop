package Transporte;

public class Automovel extends Transporte {
    private String placa;



    public Automovel(String marca, String modelo, float quilometragem, double capacidadeTanque) {
        super(marca, modelo, quilometragem, capacidadeTanque);
    }

    public Automovel() {

    }


    @Override
    public void mover() {
        System.out.println(" movendo ");
        quilometragem += 8;
        capacidadeTanque -= 1;
    }

    @Override
    public void abastecer() {
        capacidadeTanque = capacidadeTanque + 1;
    }

    @Override
    public void exibir() {
        System.out.println("Quilomegtragem: " + getQuilometragem());
        System.out.println("Combustível: " + getCapacidadeTanque());
    }

    public Automovel(String marca, String modelo, float quilometragem, double capacidadeTanque, String placa) {
        super(marca, modelo, quilometragem, capacidadeTanque);
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", quilometragem=" + quilometragem +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }
}
