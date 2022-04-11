package Transporte;

public class MeiosDeTransporte {

    public static void main(String[] args) {
        Automovel auto = new Automovel();
        Aviao nave = new Aviao();

        auto.setMarca("Ford");
        auto.setModelo("EcoSport");
        auto.setPlaca("OJG9856");
        auto.setQuilometragem(80);
        auto.setCapacidadeTanque(120);

        auto.mover();
        auto.abastecer();

        nave.setMarca("Marca de avião");
        nave.setModelo("jato");
        nave.setCodigo("123");
        nave.setQuilometragem(900);
        nave.setCapacidadeTanque(30000);

        nave.mover();
        nave.abastecer();

        System.out.println(auto.toString());
        System.out.println(nave.toString());

    }
}
