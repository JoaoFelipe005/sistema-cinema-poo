public class Bilhete {

    private Usuario usuario;
    private Filme filme;
    private int linha;
    private int coluna;
    private double valor;

    public Bilhete(Usuario usuario, Filme filme,
                    int linha, int coluna, double valor) {

        this.usuario = usuario;
        this.filme = filme;
        this.linha = linha;
        this.coluna = coluna;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}