import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Declarando variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Instanciando o objeto scanner da classe Scanner e configurando o padrão local do US
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // US pois a entrada decimal usa ponto final e não virgula

        // Obtendo os valores dos atributos pelo terminal através da scanner, inicializando as variáveis.
        System.out.print("Por favor, digite o número da sua Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Cliente, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Cliente, digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();

        // Exibição da mensagem da conta criada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\n");

    }
}
