import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {

    public static void main(String[] args) {
        System.out.println("Adivina el numero que estoy pensando");

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int numero = r.nextInt(10) + 1;
        int intentos = 0;
        boolean adivino = false;

        while (intentos < 3) {
            System.out.println("escribe un numero");
            int numero2 = sc.nextInt();

            intentos++;

            if (numero2 == numero) {
                System.out.println("felicidades, adivinaste");
                adivino = true;
                break;
            } else {
                System.out.println("incorrecto");
            }
        }

        if (!adivino) {
            System.out.println("lo siento, no adivinaste");
            System.out.println("el numero era: " + numero);
        }
    }
}
 //aqui usé la ia para que me explicara conceptos ggs