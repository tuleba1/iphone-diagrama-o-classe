public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusicalPessoal reprodutor = new ReprodutorMusicalPessoal();
        NavegadorInternetPessoal navegador = new NavegadorInternetPessoal();
        AparelhoTelefonicoPessoal telefone = new AparelhoTelefonicoPessoal();

        reprodutor.selecionarMusica("JAY-Z - Empire State Of Mind ft. Alicia Keys");
        reprodutor.tocar();
        reprodutor.pausar();
        System.out.println("");

        navegador.exibirPagina("htpps://www.exemplo.com.br");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        System.out.println("");

        telefone.ligar("+55 81 1234-5678");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println("");
    }
}