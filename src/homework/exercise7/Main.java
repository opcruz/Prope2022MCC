
package homework.exercise7;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String text;
        StringAnalyzer analyzer;

        do {
            System.out.println("Ingrese el texto:");
            text = input.nextLine();
            analyzer = new StringAnalyzer(text);
            analyzer.printInfo();
        } while (repeat());

    }

    public static boolean repeat() {
        System.out.println();
        System.out.println("Salir?");
        System.out.println("1.Sí");
        System.out.println("2.No");
        int option = -1;

        do {
            System.out.print("Opción: ");
            String line = input.nextLine();
            try {
                option = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
        } while (option != 1 && option != 2);
        System.out.println();
        return option == 2;
    }

}
