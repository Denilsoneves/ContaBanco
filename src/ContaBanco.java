import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" Digite seu nome: ");
        String nome = scanner.next();
        

        System.out.println(" Digite seu sobrenome: ");
        String sobrenome = scanner.next();


        System.out.println("Digite sua Agencia");
        String agencia = scanner.next();

        
        System.out.println("Digite o numero da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu Saldo");
        Double saldo = scanner.nextDouble();



        System.out.println( "Ola , " + nome +  sobrenome +  " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é " + saldo + ",já está disponível para saque.");
        

         

    }
}
