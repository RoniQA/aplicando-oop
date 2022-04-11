package exercicio_01_escola;

public class Funcionario {

    private String nome;
    private String funcao;
    private Double salario;

    private static int numFuncionarios;

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome = '" + nome + '\'' +
                ", funcao = '" + funcao + '\'' +
                ", salario = " + salario +
                '}';
    }

    public void aumentarSalario(float aum){
        this.salario += aum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getSalario() {
        return salario;
    }

    public float setSalario(Double salario) {
        this.salario = salario;
        return 0;
    }

    public static int getNumFuncionarios() {
        return numFuncionarios;
    }

    public static void setNumFuncionarios(int numFuncionarios) {
        Funcionario.numFuncionarios = numFuncionarios;
    }

    public Funcionario(String nome, String funcao, Double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }
}
