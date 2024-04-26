package exercicio02;

import java.util.*;

public class Vetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int i = 0;
        int number;

        try {
            do {
                System.out.print("Digite o número a ser inserido no vetor ou 0 para encerrar: ");
                number = scanner.nextInt();
                array[i] = number;
                i++;
            } while (number != 0);

            System.out.print("Elementos do vetor: ");
            for (int j = 0; j < i; j++) {
                System.out.print(array[j] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Limite de 10 valores excedido.");
        } catch (InputMismatchException e) {
            System.out.println("O valor deve ser um número inteiro.");
        } finally {
            scanner.close();
        }
    }
}
