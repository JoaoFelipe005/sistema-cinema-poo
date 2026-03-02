public class Main {

    public static void main(String[] args) {

        // 1️⃣ Criar usuário
        Usuario usuario = new Usuario("Joao", "123456789");

        // 2️⃣ Criar filme
        Filme filme = new Filme(
                "Homem Aranha",
                120,
                "Filme de ação",
                20.0
        );

        // 3️⃣ Criar sessão
        Sessao sessao = new Sessao(filme);

        // ocupar cadeira (linha 2 coluna 3)
        sessao.ocuparCadeira(2, 3);

        // 4️⃣ Criar bilhete
        Bilhete bilhete = new Bilhete(
                usuario,
                filme,
                2,
                3,
                filme.getValor()
        );

        // 5️⃣ Criar compra
        Compra compra = new Compra();
        compra.adicionarBilhete(bilhete);

        // 6️⃣ Mostrar resultado
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Filme: " + filme.getNome());
        System.out.println("Total da compra: R$ " + compra.calcularTotal());
    }
}