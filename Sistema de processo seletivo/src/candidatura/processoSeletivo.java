package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class processoSeletivo {

public static void main(String[] args) {
    
String[] candidatos = {"FELIPE", "MANOEL", "RIQUELME", "JULIA", "MARCIA", "RODRIGO", "Jonas", "Clarice", "Ruan"};
int candidatosSelecionados = 0;
Double salarioBase = 2000.0;
int contador = 0;
String [] nomesParaLigar = new String[6];  
  

while (candidatosSelecionados <5 && contador < candidatos.length){ 
String candidato = candidatos[contador];
double salarioPretendido = valorPretendido(); 
System.out.printf("\nO Candidato " + candidato + " Solicitou o valor: " + salarioPretendido);
if (salarioBase >= salarioPretendido){ 
System.out.println(" (candidato selecionado)");
nomesParaLigar[candidatosSelecionados] = candidato;
candidatosSelecionados ++;      
}
else { 
System.out.println(" (cadidato reprovado)");

}

contador ++;

if (contador == candidatos.length){
System.out.println("\nOs candidatos selecionados foram ");    
for(String selecs: nomesParaLigar){ 
System.out.println(selecs);

}

}

}

for (String selecs : nomesParaLigar){ 
EntrandoemContato(selecs);}
}


static double valorPretendido(){ 
return ThreadLocalRandom.current().nextDouble(1800, 2200);
}


static void EntrandoemContato(String selecs){

int tentativas = 1;

boolean atendeu = false; 
boolean continuartentando = true; 

do{   

atendeu = atender(); 
continuartentando = ! atendeu; 

if (continuartentando){ 

tentativas ++;
}

}while (continuartentando && tentativas < 3);

if(atendeu){ 

System.out.println("\nConseguimos contato com " + selecs + " na " + tentativas + " tentativa ");
}

else System.out.println("\nNão conseguimos contato com " + selecs + " número máximo de tentativas " + tentativas);

}

static boolean atender(){ 
return new Random().nextInt(3)==1;
}

}

