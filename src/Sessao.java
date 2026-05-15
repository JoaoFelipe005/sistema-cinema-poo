public class Sessao {
    private Filme filme;
    private boolean[][] cadeiras = new boolean[10][15]; 
    private int numeroSala; 
    private TipoSala tipoSala;
    private String horario;

    public Sessao(Filme filme, int numeroSala, TipoSala tipoSala, String horario) {
    this.filme = filme;
    this.numeroSala = numeroSala;
    this.tipoSala = tipoSala;
    this.horario = horario;
}

    public boolean reservarCadeira(int linha, int coluna) {
        if (!cadeiras[linha][coluna]) { 
            cadeiras[linha][coluna] = true;
            return true;
        }
        return false;
    }

    public Filme getFilme() {
        return filme;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public TipoSala getTipoSala() {
    return tipoSala;
}
    public String getHorario() {
    return horario;
}
}
