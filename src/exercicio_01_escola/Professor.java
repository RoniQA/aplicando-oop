package exercicio_01_escola;

public class Professor extends Funcionario{
    private int numDiciplinas;

    public Professor(String nome, String funcao, Double salario, int numDiciplinas) {
        super(nome, funcao, salario);
        this.numDiciplinas = numDiciplinas;
        if (numDiciplinas <= 1){
            System.out.println("Disciplinas insuficientes");
        }
    }

    public Professor() {
    }

    @Override
    public String toString() {
        return "Professor{" + getNome() + "\" " +
                "função = " + getFuncao() + "\"" +
                "numDiciplinas = " + getNumDiciplinas() + "\"" +
                "salario " + getSalario() +
                '}';
    }

    @Override
    public void aumentarSalario(float aum) {
        super.aumentarSalario(aum + numDiciplinas * 100);

    }

    public int getNumDiciplinas() {
        return numDiciplinas;
    }

    public void setNumDiciplinas(int numDiciplinas) {
        this.numDiciplinas = numDiciplinas;
    }

    }

