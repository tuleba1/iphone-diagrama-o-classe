public class MeuReprodutorMusical implements ReprodutorMusical {
    private String musicaAtual;

    public void tocar(){
        System.out.println("Tocando música: " + musicaAtual);
    }

    public void pausar(){
        System.out.println("Pausar música " + musicaAtual);
    }
    public void selecionarMusica(String musica){
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    public static void main(String[] args) {
        MeuReprodutorMusical reprodutor = new MeuReprodutorMusical();
        reprodutor.selecionarMusica("JAY-Z - Empire State Of Mind ft. Alicia Keys");
        reprodutor.tocar();
        reprodutor.pausar();
    }

}
