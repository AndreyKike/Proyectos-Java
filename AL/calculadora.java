import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        System.out.println("escribe un numero:");
                Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        System.out.println("ahora seleccion la operacion deseada a hacer");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.division");

        int opcion = sc.nextInt();

        System.out.println("escribe el siguiente numero");
                Scanner sc2 = new Scanner(System.in);
        double num2 = sc2.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("tu numero es : "+ (num+num2));
                break;
            case 2:
                System.out.println("tu numero es : "+ (num-num2));
                break;
            case 3:
                System.out.println("tu numero es : "+ (num*num2));
                break;
                case 4:
                System.out.println("tu numero es : "+ (num/num2));
                break;
        }


          //reto de la calculadora hecha ggs
    }
    }