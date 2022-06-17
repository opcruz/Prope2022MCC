
package homework.exercise8;

import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Game game;
        do {
            game = selectGame();
            game.start();
        } while (playAgain());

    }

    public static Game selectGame() {
        System.out.println("Seleccione el juego:");
        System.out.println("1.Contra la computadora");
        System.out.println("2.Programa adivina");

        int option = -1;
        Game game;

        do {
            System.out.print("Opción: ");
            String line = input.nextLine();
            try {
                option = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
        } while (option != 1 && option != 2);

        switch (option) {
            case 1:
                game = new GameVSMachine();
                break;
            case 2:
                game = new GameMachineGuesses();
                break;
            default:
                throw new IllegalArgumentException(); // not happens
        }

        return game;
    }

    public static boolean playAgain() {

        System.out.println();
        System.out.println("Volver a jugar");
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
        return option == 1;
    }

}
