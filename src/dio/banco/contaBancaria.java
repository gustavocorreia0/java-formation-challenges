package dio.banco;

import java.util.Scanner;

public class contaBancaria {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Integer conta;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Digite o número da conta: ");
        conta = sc.nextInt();

        System.out.println("Digite a agência da conta: ");
        agencia = sc.next();
        
        System.out.println("Digite o nome do cliente: ");
        nome = sc.next();
        
        System.out.printf("Digite o saldo de %s: ", nome);
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, seja bem-vindo(a)!%n", nome);

        System.out.printf("Sua conta %d da agência %s está com R$ %.2f de saldo!", conta, agencia, saldo);
        
        sc.close();

    }
    
}