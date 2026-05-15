public class Main {
    public static void main(String[] args) {

        Usuario u = new Usuario("João", "123", "senha", 20, "M", "email",
                "Joao", "1111", "123");

        Estudante e = new Estudante("Maria", "456", "programacao", 18, "F", "email",
                "Maria", "2222", "456");

        Critico critico = new Critico("Leo Dias", "555", "fofoca", 45, "M", "email",
                "leo", "1234", "554", "Globo");

        Filme f = new Filme("Batman", 20.0, 120, "Filme do Batman");
        Filme f2 = new Filme("Orgulho e Preconceito", 20.0, 130, "Romance clássico");

        Sessao s = new Sessao(f, 1, TipoSala.TRES_D, "18:00 - 20:00");
        Sessao s2 = new Sessao(f2, 2, TipoSala.COMUM, "20:00 - 22:00");

        // Usando sala
        Sala sala = new Sala(5);
        sala.adicionarSessao(0, s);
        sala.adicionarSessao(1, s2);

        // Mostrar Sessoes
        sala.mostrarSessoes();

        Bilhete b1 = new Bilhete(u, s, 2, 5);
        Bilhete b2 = new Bilhete(e, s, 2, 6);
        Bilhete b3 = new Bilhete(critico, s2, 3, 4);

        Compra c = new Compra();

        c.adicionarBilhete(b1);
        c.adicionarBilhete(b2);
        c.adicionarBilhete(b3);

        c.adicionarProduto(Produto.PIPOCA);
        c.adicionarProduto(Produto.REFRIGERANTE);

        // críticas
        critico.atribuirNota(10, f);
        critico.atribuirCritica("Filme muito bom.", f);

        critico.atribuirNota(8, f);
        critico.atribuirCritica("Ótima atuação do protagonista.", f);

        critico.atribuirNota(7, f2);
        critico.atribuirCritica("Bom, mas um pouco lento.", f2);

        // exibição
        c.mostrarCompra();

        System.out.println("\n===== FILME 1 =====");
        System.out.println("Nome: " + f.getNome());
        System.out.println("Nota média: " + f.getNota());
        System.out.println("Quantidade de críticos: " + f.getQuantidadeCriticos());
        f.mostrarCriticas();

        System.out.println("\n===== FILME 2 =====");
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Nota média: " + f2.getNota());
        System.out.println("Quantidade de críticos: " + f2.getQuantidadeCriticos());
        f2.mostrarCriticas();

        System.out.println("\nTotal normal: R$ " + c.calcularTotal());
        System.out.println("Total com desconto: R$ " +
                c.calcularTotal(CupomPromocional.DESCONTO10));
    }
}