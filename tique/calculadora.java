import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opt1 = "1. Suma";
        String opt2 = "2. Resta";
        String opt3 = "3. Multiplicacion";
        String opt4 = "4. Division";

        System.out.print("Seleccione una opción:\n" + opt1 + "\n" + opt2 + "\n" + opt3 + "\n" + opt4 + "\n");
        int opcion = scanner.nextInt();

        if (opcion < 1 || opcion > 4) {
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            return;
        }

        else if (opcion == 1) {
            System.out.print("Primer numero: ");
            Double sum1 = scanner.nextDouble();
            System.out.print("Segundo numero: ");
            Double sum2 = scanner.nextDouble();
            System.out.print("Resultado: " + (sum1 + sum2));
        }

        else if (opcion == 2) {
            System.out.print("Primer numero: ");
            Double rest1 = scanner.nextDouble();
            System.out.print("Segundo numero: ");
            Double rest2 = scanner.nextDouble();
            System.out.print("Resultado: " + (rest1 - rest2));
        }

        else if (opcion == 3) {
            System.out.print("Primer numero: ");
            Double mul1 = scanner.nextDouble();
            System.out.print("Segundo numero: ");
            Double mul2 = scanner.nextDouble();
            System.out.print("Resultado: " + (mul1 * mul2));
        }

        else if (opcion == 4) {
            System.out.print("Primer numero: ");
            Double div1 = scanner.nextDouble();
            System.out.print("Segundo numero: ");
            Double div2 = scanner.nextDouble();
            System.out.print("Resultado: " + (div1 / div2));
        }
    }
}