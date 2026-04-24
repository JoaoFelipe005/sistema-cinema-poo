public class Sala { // alterar
    private Sessao[] sessoes; // array vetor que guarda varios objetos da sessao

    public Sala(int tamanho) {
        sessoes = new Sessao[tamanho]; // Instancia o array
    }

    public void adicionarSessao(int index, Sessao sessao) {
        sessoes[index] = sessao; 
    }

    public Sessao getSessao(int index) {
        return sessoes[index];
    }
}