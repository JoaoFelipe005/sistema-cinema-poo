public class Filme {
    private String nome;
    private double valor;
    private double nota;
    private int quantidadeCriticos;
    private Critica[] criticas = new Critica[100];
    private int totalCriticas = 0;

    public Filme(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void adicionarCritica(Critica c) {
        criticas[totalCriticas] = c;
        totalCriticas++;
    }

    public void adicionarNota(double novaNota) {
        nota = ((nota * quantidadeCriticos) + novaNota) / (quantidadeCriticos + 1);
        quantidadeCriticos++;
    }

    public String getNome() { return nome; }
    public double getValor() { return valor; }
}