
import funcionalidades.funcionalidades0;
import java.util.Scanner;

public class iphone {
    public static void main(String[] args){
     
    funcionalidades0 funcao = new funcionalidades0();
     
    Scanner scanner = new Scanner (System.in); 

    

System.out.println("\nSelecione a função desejada: \n");
System.out.println("\n1 para ouvir música.\n2 para pausar a música\n3 para selecionar a música\n4 para ligar\n5 para atender\n6 para iniciar o correio de voz\n7 para iniciar o navegador\n8 para abrir uma nova aba\n9 para atualizar a página\n");

int seletor = scanner.nextInt(); 
switch(seletor) { 
//função mp3
case 1: 
funcao.tocarMusica(); 
break;
case 2: 
funcao.pausarMusica(); 
break; 
case 3: 
funcao.selecionarMusica(); 
break; 
//função próprias de um celular 
case 4: 
funcao.ligar(); 
break; 
case 5: 
funcao.atender(); 
break; 
case 6: 
funcao.iniciarCorreiodeVoz(); 
break; 
//navegador de internet 
case 7: 
funcao.exibirpagina(); 
break; 
case 8: 
funcao.adicionarnovaba(); 
break; 
case 9: 
funcao.atualizarpagina(); 
break;
}
scanner.close();    
    
    
    
    
    
    
}
    
}

