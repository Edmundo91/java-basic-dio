package funcionalidades;

import Telephone.Telefone;
import MusicPlayer.MusicPlayer;
import Navegador.Navegador;

public class funcionalidades0 implements Telefone, MusicPlayer, Navegador {
    
@Override
public void ligar() {
    System.out.println("ligando...");
    
}
@Override
public void atender() {
    System.out.println("Chamada Atendida");
    
}

@Override
public void iniciarCorreiodeVoz() {
    System.out.println("Correio de voz iniciado");
    
}

@Override
public void tocarMusica() {
    System.out.println("Música tocando via controle central...");
    
}

@Override
public void pausarMusica() {
    System.out.println("Música pausada via controle central");


}

@Override
public void selecionarMusica() {
    System.out.println("Selecione a música desejada via controle central");
    
}

@Override
public void exibirpagina() {
    
    System.out.println("exibindo página");

}

@Override
public void adicionarnovaba() {
    
    System.out.println("Adicionando nova aba");

}

@Override
public void atualizarpagina() {
    System.out.println("Página atualizada");


}



}
