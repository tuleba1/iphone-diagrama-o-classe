public class NavegadorInternetPessoal implements NavegadorInternet{
    public void exibirPagina(String url){
        System.out.println("Exibindo Página " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada.");
    }
    public void atualizarPagina(){
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        NavegadorInternetPessoal navegador = new NavegadorInternetPessoal();
        navegador.exibirPagina("htpps://www.exemplo.com.br");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
