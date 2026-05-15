public class Funcionario extends Base implements GerenciaFilmes {

    private double salario;

    public Funcionario(String nome, int idade, String email, double salario) {
        super(nome, idade, email);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }