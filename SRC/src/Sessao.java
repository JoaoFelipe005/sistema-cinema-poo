public class Sessao {

    private Filme filme;
    private boolean[][] cadeiras;

    public Sessao(Filme filme) {
        this.filme = filme;
        cadeiras = new boolean[10][15]; // false = livre
    }

    public Filme getFilme() {
        return filme;
    }

    public boolean ocuparCadeira(int linha, int coluna) {
        if (!cadeiras[linha][coluna]) {
            cadeiras[linha][coluna] = true;
            return true;
        }
        return false;
    }
}