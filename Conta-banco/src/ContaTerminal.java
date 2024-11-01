import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        try (//criando o objeto scanner
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            //Nome do cliente
            System.out.println("Digite seu nome");
            String nomeCliente = scanner.next();
            
            //agencia
            System.out.println("Por favor, digite o número da agencia");
            String agencia = scanner.next();

            //Usuario
            System.out.println("Numero");
            int numero = scanner.nextInt();
            

            //saldo
            
            double saldo = 237.48;

            


            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque" );
        }
    }
}
