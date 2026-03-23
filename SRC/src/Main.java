public class Main {
    public static void main(String[] args) {

        Usuario a1 = new Usuario("joao", "123", "senha", 20, "M", "email",
                "Joao", "1111", "123");

        Filme f1 = new Filme("Batman", 120, "Filme", 20.0);

        Sessao s1 = new Sessao(f1, 1); 
        s1.reservarCadeira(2, 5);

        Bilhete b1 = new Bilhete(a1, s1, 2, 5);

        Compra c1 = new Compra();
        c1.adicionarBilhete(b1);

        c1.mostrarCompra();
    }
}