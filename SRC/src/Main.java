public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Joao", "123456789");

        Filme filme = new Filme(
                "Homem Aranha",
                120,
                "Filme de ação",
                20.0
        );

        Sessao sessao = new Sessao(filme);

        sessao.ocuparCadeira(2, 3);

        Bilhete bilhete = new Bilhete(
                usuario,
                filme,
                2,
                3,
                filme.getValor()
        );

        Compra compra = new Compra();
        compra.adicionarBilhete(bilhete);

    
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Filme: " + filme.getNome());
        System.out.println("Total da compra: R$ " + compra.calcularTotal());
    }
}