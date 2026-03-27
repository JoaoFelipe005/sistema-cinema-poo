public class Bilhete {
    private Usuario usuario;
    private Sessao sessao;
    private double valor;
    private int linha;
    private int coluna; // atributos

   public Bilhete(Usuario usuario, Sessao sessao, int linha, int coluna) {
    this.usuario = usuario;
    this.sessao = sessao;
    this.linha = linha;
    this.coluna = coluna;
    double valorBase = sessao.getFilme().getValor();
    this.valor = usuario.calcularValor(valorBase);  // usamos para buscra o preço do filme e aplicar o desconto do tipo do usuario
}
    public Usuario getUsuario() { 
        return usuario; }
    public Sessao getSessao() { 
        return sessao; 
    }
    public double getValor() { 
        return valor; 
    }

    public int getLinha() { 
        return linha; 
    }
    public int getColuna() { 
        return coluna; 
    }
}