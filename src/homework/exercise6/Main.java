
package homework.exercise6;

import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int result;

        do {
            System.out.println("Ingrese el número romano:");
            String line = input.nextLine().trim();
            if (line.length() > 10) {
                line = line.substring(0, 10);
            }
            try {
                result = RomanNumber.toDecimal(line);
                System.out.println("Valor en númeración arábiga: " + result);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
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
