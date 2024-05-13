import java.util.Scanner;

public class contaTerminal {
    public static void main(String [] args) { 

     int numero; 

     String agencia; 

     String nome; 

     Double saldo; 
    
     Scanner scanner = new Scanner(System.in); 

System.out.println("Cadastre-se aqui:");
    System.out.println("Digite o Número da Conta: ");
    numero = scanner.nextInt(); 

    System.out.println("Digite o Número da Agencia: "); 
     scanner.nextLine(); 
    agencia = scanner.nextLine();
    
    System.out.println("Digite o Seu Nome: "); 
    nome = scanner.nextLine(); 
    
    System.out.println( "Informe o Seu Saldo: "); 
    saldo = scanner.nextDouble(); 

    scanner.close(); 

    
System.out.println("Olá " + nome + ", " + "orbigado por criar sua conta no nosso banco," + " sua agencia é " + agencia + ", " + "conta " + numero + "," + " e seu saldo " + saldo + " já está disponível para o saque."); 
 
}


    }    
    









