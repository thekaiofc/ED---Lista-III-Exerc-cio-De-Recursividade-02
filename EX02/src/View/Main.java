package View;

import java.util.Scanner;
import Controller.Contador;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int digito;

        // Validação do número (10 a 999999)
        do {
            System.out.print("Digite um número entre 10 e 999999: ");
            numero = sc.nextInt();

            if (numero < 10 || numero > 999999) {
                System.out.println("Número inválido!");
            }

        } while (numero < 10 || numero > 999999);

        // Validação do dígito (0 a 9)
        do {
            System.out.print("Digite um dígito (0 a 9): ");
            digito = sc.nextInt();

            if (digito < 0 || digito > 9) {
                System.out.println("Dígito inválido!");
            }

        } while (digito < 0 || digito > 9);

        Contador controller = new Contador();

        int resultado = controller.contarOcorrencias(numero, digito);

        System.out.println("O dígito " + digito + " aparece " + resultado + " vez(es).");

        sc.close();
    }
}