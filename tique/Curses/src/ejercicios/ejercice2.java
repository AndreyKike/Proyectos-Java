package ejercicios;

import java.util.Scanner;

public class ejercice2 {
    public static void main(String[] args) {

        String user = "andrey";
        int paswor = 1234;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre de usuario: ");
        String InputUser = scanner.nextLine();
        System.out.print("Ingresa tu contrasenia: ");
        int InputPaswor = scanner.nextInt();
        if (InputUser.equals(user) && InputPaswor == paswor){
            System.out.print("Bienvenido " + InputUser);
        }
        else{
            System.out.print("Usuario o contrasenia incorrectos");
        }
    }

}