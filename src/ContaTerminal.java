import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        agencia = sc.next();

        System.out.println("Por favor, digite seu nome:");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite seu saldo:");
        double saldo = Double.parseDouble(sc.next());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}