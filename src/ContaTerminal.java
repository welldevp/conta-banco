import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner

        //Exibir as mensagens para o usuário

        //obter pela classe Scanner os valores digitados no terminal

        //exibir a mensagem da conta criada 
        
        Scanner scr = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("Digite seu nome: ");
        String nome = scr.nextLine();   
        
        System.out.println("Digite o número da conta(123): ");
        int conta = scr.nextInt();

        System.out.println("Digite o número da Agência (123-8): ");
        String agencia = scr.next();

        System.out.println("Digite saldo: ");
        Double saldo = scr.nextDouble();       

        System.out.println();
        System.out.printf("Olá! %s, obrigado por criar uma conta em nosso banco"  
        + "\n Sua conta é: %s "
        + "\n Sua agencia é: %s" 
        + "\n seu saldo é de: %s já está disponível para saque", nome, conta, agencia, saldo);

        scr.close();
    }
}
