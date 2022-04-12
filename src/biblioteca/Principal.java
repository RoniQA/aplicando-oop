package biblioteca;

public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro(1, "A cabana", "Windblown Media");
        Livro l2 = new Livro(2, "A travessia", "Windblown Media");
        Livro l3 = new Livro(3, "A cabana guia de estudos", "Windblown Media");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLiivros(l1);
        biblioteca.cadastrarLiivros(l2);
        biblioteca.cadastrarLiivros(l3);

        Usuario usuario1 = new Usuario("Ronin", 123456L, 001);
        System.out.println("Multa do aluguel do livro: R$ " + usuario1.alugarLivro(40));

        Usuario usuario2 = new Usuario("Mick", 789456L, 002);
        System.out.println("Multa do aluguel do livro: R$ " + usuario2.alugarLivro(14));

        Monitor m1 = new Monitor("Cadinho", 456132L, 003);
        System.out.println("Multa do aluguel do livro: R$ " + m1.alugarLivro(40));

        Monitor m2 = new Monitor("Kevin", 132798L, 004);
        System.out.println("Multa do aluguel do livro: R$ " + m2.alugarLivro(20));

    }
}
