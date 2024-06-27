public class ReprodutorMusicalPessoal implements ReprodutorMusical {
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

}
