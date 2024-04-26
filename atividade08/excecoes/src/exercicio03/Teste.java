package exercicio03;

import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Login login = new Login("Vitor003", "123456");

        try {
            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            login.fazer_login(usuario, senha);
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
