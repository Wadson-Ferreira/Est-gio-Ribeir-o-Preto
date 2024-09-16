package contadorDeA.Main;

import java.util.Scanner;

public class ContadorDeA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Informe uma string: ");
            String input = scanner.nextLine();

            // Chama o método para contar quantas vezes a letra "a" aparece.
            int contador = contarLetraA(input);

            // Verifica se o contador contou pelo menos 1 vez a letra "a".
            if (contador > 0) {
                System.out.println("A letra 'a' (maiúscula ou minúscula) " +
                        "ocorre " + contador + " vezes na string digitada.");
            } else {
                System.out.println("A letra 'a' (maiúscula ou minúscula) não " +
                        "ocorre na string.");
            }
        } finally {
            scanner.close();
        }
    }


    /* Método que conta quantas vezes a letra "a" aparece na string
    utilizando a Stream API. */

    public static int contarLetraA(String str) {
        return (int) str.chars().filter(c -> c == 'a' || c == 'A').count();
    }


}
