package MusicPlayer;

public class Mp3 implements MusicPlayer {
    
    @Override
    public void tocarMusica() {
    System.out.println("tocando via mp3");
    }

    public void pausarMusica() {
        System.out.println("Música pausada via mp3");
    
    
    }
    
    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a música desejada via mp3");
        
    }


}
