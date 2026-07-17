import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Te contare una historia, pero primero necesito algo de informacion");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Como se llama el personaje?: ");
        String name = scanner.nextLine();
        System.out.print("Cual es su trabajo?: ");
        String job = scanner.nextLine();

        System.out.print("Aquí está la historia:" + "Erase una vez, " + name + "Que era" + job + "De camino al trabajo, " + name + "relfexiono sobre la vida." + "Quizas," + name + "no sea" + job + "para siempre");
    }
}