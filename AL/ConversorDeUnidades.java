import java.util.Scanner;
public class ConversorDeUnidades {
    public static void main (String[]args){

        System.out.println("¿que conversion deseas realizar?");
        System.out.println("1.metros a centimetros");
        System.out.println("2.dolares a pesos");
        System.out.println("3.grados farenheit a grados celsius");
        System.out.println("4.libras a kilogramos");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("ok, ingresa la cantidad de metros que quieras calcular");
                int metros = sc.nextInt();
                System.out.println("son :" + (metros * 100));
                break;
            case 2:
                System.out.println("ponga el valor en dolares que desee convertir");
                int dolares = sc.nextInt();
                System.out.println("son :" + (dolares * 3295));
                break;
            case 3:
                System.out.println("ponga el valor de los grados farenheit que desee convertir");
                int f = sc.nextInt();
                System.out.println("son :" + (f - 32) * 5 / 9);
                break;
            case 4:
                System.out.println("ponga el valor de las libras que desee convertir");
                int libras = sc.nextInt();
                System.out.println("son :" + (libras * 0.453592));
                break;

        }


    }
}

