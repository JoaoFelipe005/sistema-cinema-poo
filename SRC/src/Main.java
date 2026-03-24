public class Main {
    public static void main(String[] args) {

        Usuario u = new Usuario("joao", "123", "senha", 20, "M", "email",
                "Joao", "1111", "123");

        Filme f = new Filme("Batman", 120, "Filme do Batman", 20.0);

        Sessao s = new Sessao(f, 1);
        s.reservarCadeira(2, 5);

        Bilhete b = new Bilhete(u, s, 2, 5);

        Compra c = new Compra();
        c.adicionarBilhete(b);

        c.mostrarCompra();
    }
}