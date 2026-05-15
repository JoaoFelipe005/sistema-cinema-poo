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

    @Override
    public void adicionarUsuario(Usuario usuario) { // metodo da classe abstrata
        System.out.println("Usuário adicionado pelo funcionário.");
    }

    @Override
    public void alterarUsuario(Usuario usuario) {
        System.out.println("Usuário alterado pelo funcionário.");
    }

    }