package sequenciaFibonacci.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        //Verifica se a entrada de dado está correta.
        while (!entradaValida) {
            try {
                System.out.print("Informe um número: ");
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um " +
                        "número inteiro.");
                scanner.next(); // Limpa o buffer do scanner.
            }
        }

        /* Chama o método para verificar se o número pertence à sequência de
        Fibonacci.*/
        boolean pertence = pertenceASequenciaFibonacci(numero);

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência " +
                    "de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à " +
                    "sequência de Fibonacci.");
        }

        scanner.close();
    }

    // Método que verifica se o número pertence à sequência de Fibonacci.
    public static boolean pertenceASequenciaFibonacci(int numero) {

    /* Verifica se o número é negativo, caso seja já retorna que o número não
        pertence à Fibonacci.*/
        if (numero < 0) {
            return false;
        }

    /* Executa a sequência até o número informado para verificar se ele
         pertence à Fibonacci. */
        if (numero == 0 || numero == 1) {
            return true;
        }

        int prev = 0;
        int current = 1;

    /* Executa a sequência até o numero informado para verificar se ele
        pertence a fibonacci. */
        while (current < numero) {
            int temp = prev + current;
            prev = current;
            current = temp;
        }

        return current == numero;
    }
}
