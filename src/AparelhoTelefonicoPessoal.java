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

}
