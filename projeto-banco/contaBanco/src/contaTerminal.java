import java.util.Scanner;
import java.util.Locale;

public class contaTerminal {
	
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite o numero da Agência! ");
        String agencia = scanner.next();

		System.out.println("Por favor, digite o numero da conta ");
        int numeroConta = scanner.nextInt();

		System.out.println("Por favor, digite o seu nome ");
        String nome = scanner.next();

		System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

		System.out.println("Por favor, digite o saldo ");
        float saldo = scanner.nextFloat();
		
		System.out.println("Olá " + nome+ " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +  numeroConta + "e seu saldo " + saldo + " já está disponível para saque");


    }
}
