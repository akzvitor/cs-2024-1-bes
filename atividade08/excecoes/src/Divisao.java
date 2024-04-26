import java.util.*;

public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int firstNum = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int secondNum = scanner.nextInt();

            int result = firstNum / secondNum;
            System.out.print("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível realizar uma divisão por zero.");
        } catch (InputMismatchException e) {
            System.out.println("A entrada deve ser um número inteiro.");
        }
    }
}