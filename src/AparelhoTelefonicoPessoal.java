public class AparelhoTelefonicoPessoal implements AparelhoTelefonico {
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para o número " + numero);
    }
    public void atender(){
        System.out.println("Atendendo a chamada.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz.");
    }

    public static void main(String[] args) {
        AparelhoTelefonicoPessoal telefone = new AparelhoTelefonicoPessoal();
        telefone.ligar("+55 81 1234-5678");
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }
}
