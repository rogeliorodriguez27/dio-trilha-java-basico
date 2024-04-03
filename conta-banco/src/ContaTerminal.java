// import java.util.Scanner;

/* public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite seu nome!");
        String cliente = scanner.nextLine();

        System.out.println("Por favor, digite su número de agencia!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite su número de conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite su saldo !");
        double saldo = scanner.nextDouble();



        
//        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %d já está disponível para saque", cliente, agencia, numero, saldo);
        System.out.printf("Olá " +  cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +  " e seu saldo " + saldo + " já está disponível para saque");
    
    } 
}*/

/**
 * ContaTerminal
 */
public class ContaTerminal {

    public static void main(String[] args) {
        String contas[] = { "corriente", "ahorros", "salario" };
        
        for (String tipo : contas) {
            System.out.println(tipo);
        }
    }
}