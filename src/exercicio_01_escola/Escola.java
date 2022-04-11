package exercicio_01_escola;

public class Escola {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Professor professor = new Professor();

       /* System.out.println(funcionario.toString());
        System.out.println(professor.toString());*/


        funcionario.setNome("Episcopaldo");
        professor.setNome("Vladiscova");

        funcionario.setFuncao("financeiro");
        professor.setFuncao("professor");
        professor.setNumDiciplinas(4);

        funcionario.setSalario(1500.0);
        professor.setSalario(8000.0);

        funcionario.aumentarSalario(100);
        professor.aumentarSalario(200);

        System.out.println(funcionario.toString());
        System.out.println(professor.toString());

    }
}
