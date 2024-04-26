package exercicio04;

import java.util.*;

public class Teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(100.00);

        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.print("Digite o valor do depósito: ");
        Double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        try {
            System.out.print("Digite o valor do saque: ");
            Double valorSaque = scanner.nextDouble();
            conta.sacar(valorSaque);
            System.out.println("Saldo após saque: " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
