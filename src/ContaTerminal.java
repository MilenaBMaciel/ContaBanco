import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, agencia;
        int numeroConta;
        float saldo;

        System.out.println("Por favor, preencha os dados solicitados abaixo.");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Numero da agencia: ");
        agencia = sc.nextLine();
        System.out.print("Numero da conta: ");
        numeroConta = sc.nextInt();
        System.out.print("Saldo: ");
        saldo = sc.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+numeroConta+" e seu saldo " + saldo + " já está disponível para saque.");
        sc.close();
    }
}
