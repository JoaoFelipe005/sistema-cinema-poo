public class Main {
    public static void main(String[] args) {

        // 🔹 Usuários
        Usuario u = new Usuario("joao", "123", "senha", 20, "M", "email",
                "Joao", "1111", "123");

        Estudante e = new Estudante("maria", "456", "senha", 18, "F", "email",
                "Maria", "2222", "456");
             
        Critico critico = new Critico("Leo Dias", "555", "fofoca", 45, "M", "email","leo", "1234", "554", "Globo");

        // 🔹 Filme
        Filme f = new Filme("Batman", 20.0);
        Filme f2 = new Filme("Orgulho e Preconceito", 20.0);

        // 🔹 Sessão (sala 1)
        Sessao s = new Sessao(f, 1);
        s.reservarCadeira(2, 5);
        Sessao s2 = new Sessao(f2, 2);
        s2.reservarCadeira(4, 7);

        // 🔹 Bilhetes
        Bilhete b1 = new Bilhete(u, s, 2, 5);
        Bilhete b2 = new Bilhete(e, s, 2, 6);
        Bilhete b3 = new Bilhete(critico, s2, 3, 4);

        // 🔹 Compra
        Compra c = new Compra();
        c.adicionarBilhete(b1);
        c.adicionarBilhete(b2);
        c.adicionarBilhete(b3);

        // 🔹 Total normal
        double total = c.calcularTotal();

        // 🔹 Total com cupom
        double totalComDesconto = c.calcularTotal(CupomPromocional.DESCONTO30);

        // 🔹 Mostrar compra
        c.mostrarCompra();

        // 🔹 Mostrar totais
        System.out.println("Total normal: R$ " + total);
        System.out.println("Total com desconto: R$ " + totalComDesconto);
        
    }
}