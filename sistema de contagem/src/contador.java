import java.util.Scanner;


public class contador {
    public static void main(String[] args){

int ParametroUm;

int ParametroDois; 

Scanner sc1 = new Scanner(System.in);

System.out.println("\nContagem:\n");
System.out.println("\nDigite o primeiro número: \n"); 
ParametroUm = sc1.nextInt();



System.out.println("\nDigite o segundo número:\n"); 
ParametroDois = sc1.nextInt(); 

sc1.close();


System.out.println("\n \n");


try{

    
    contar(ParametroUm, ParametroDois);

}catch (parametrosException exception){ 

System.out.println("O primeiro número deve ser maior que o segundo.\n\n");

}

}

static void contar(int ParametroUm, int ParametroDois) throws parametrosException{ 

if(ParametroUm <= ParametroDois) 
throw new parametrosException(); 

int contador = ParametroUm - ParametroDois; 

for(int i = 0; i <= contador; i ++){ 

    System.out.println(i);
}

}


static class parametrosException extends Exception{ 




}


}


